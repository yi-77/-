package com.designmode.ea_factory.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 王辉
 * @date 2021/6/2 - 21:21
 */
public class Program {
    public static void main(String[] args) throws IOException {
        InputStreamReader stdin=null;
        BufferedReader bufferReader=null;

        stdin=new InputStreamReader(System.in);
        bufferReader=new BufferedReader(stdin);    //引用stdin指向了system.in所写入的数据，并将其存储在了缓存区中

        System.out.println("请输入数字A：");
        String A=bufferReader.readLine();
        System.out.println("请选择运算符+ - * /：");
        String B=bufferReader.readLine();
        System.out.println("请输入数字C:");
        String C=bufferReader.readLine();

        String D="";

        if ("+".equals(B)){
            D=String.valueOf(Integer.parseInt(A)+Integer.parseInt(C));
        }
        if ("-".equals(B)){
            D=String.valueOf(Integer.parseInt(A)-Integer.parseInt(C));
        }
        if ("*".equals(B)){
            D=String.valueOf(Integer.parseInt(A)*Integer.parseInt(C));
        }
        if ("/".equals(B)){
            D=String.valueOf(Integer.parseInt(A)/Integer.parseInt(C));
        }

        System.out.println("结果是："+D);


    }
}
