package com.designmode.Builder.second;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 王辉
 * @date 2021/6/22 - 16:21
 */
//                                          建造者模式
//客户端代码
public class Main extends Frame {
    public void paint(Graphics g)
    {
        Color c = g.getColor();
        g.setColor(Color.BLACK);

        PersonThinBuilder ptb = new PersonThinBuilder(g);
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.createPerson();

        g.setColor(c);
    }

    public void lauchFrame()
    {
        this.setLocation(400, 300);
        this.setSize(800, 600);

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        this.setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Main drawPerson = new Main();
        drawPerson.lauchFrame();
    }
}
