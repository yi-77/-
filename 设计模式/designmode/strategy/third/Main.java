package com.designmode.strategy.third;

/**
 * @author 王辉
 * @date 2021/6/6 - 14:48
 */

//                                     策略模式与简单工厂模式结合用法

public class Main {
    private static double total=0;

    public static void main(String[] args) {
        consume("正常",1,1000);
        consume("打8折",1,1000);
        consume("满300减100",1,1000);
        System.out.println("总计："+total);

    }

    public static void consume(String type,int num,double price){
        CashContext cashContext=new CashContext(type);
        //这里等式右边的cashContext指向CashContext对象，所以可以用它来调用CashContext中的acceptCash方法
        double totalPrice=cashContext.acceptCash(num*price);
        total+=totalPrice;
        System.out.println("数量："+num+"价钱："+price+"合计："+totalPrice);
    }

}
