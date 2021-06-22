package com.designmode.observer.first;

/**
 * @author 王辉
 * @date 2021/6/22 - 16:48
 */
public class StockObserver {
    private String		name;
    private Secretary	sub;

    public StockObserver(String name, Secretary sub)
    {
        this.name = name;
        this.sub = sub;
    }

    public void update()
    {
        System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
    }
}
