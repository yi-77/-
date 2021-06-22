package com.designmode.observer.first;

/**
 * @author 王辉
 * @date 2021/6/22 - 16:49
 */
public class Main {
    public static void main(String[] args)
    {
        // 前台小组童子喆
        Secretary tongzizhe = new Secretary();

        // 看股票的同事
        StockObserver tongshi1 = new StockObserver("魏关姹", tongzizhe);
        StockObserver tongshi2 = new StockObserver("易管查", tongzizhe);

        //前台记下了两位同事
        tongzizhe.attach(tongshi1);
        tongzizhe.attach(tongshi2);

        //发现老板回来
        tongzizhe.setAction("老板回来了!");

        //通知两个同事
        tongzizhe.announce();
    }
}
