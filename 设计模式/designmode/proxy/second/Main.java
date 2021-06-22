package com.designmode.proxy.second;

/**
 * @author 王辉
 * @date 2021/6/13 - 11:25
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl mm=new SchoolGirl();
        mm.setName("娇娇");

        Proxy daili=new Proxy(mm);  //将指向SchoolGirl类的引用mm传到daili对象中
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
