package com.designmode.proxy.first;

/**
 * @author 王辉
 * @date 2021/6/10 - 11:15
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl schoolGirl=new SchoolGirl();
        schoolGirl.name="娇娇";

        Pursuit pursuit=new Pursuit(schoolGirl);
        pursuit.giveDolls();
        pursuit.giveFlowers();
        pursuit.giveChocolate();
       // System.out.println(pursuit.schoolGirl);   //输出指向schoolGril对象的引用的内存地址
    }
}
