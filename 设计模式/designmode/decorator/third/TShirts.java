package com.designmode.decorator.third;

/**
 * @author 王辉
 * @date 2021/6/9 - 18:22
 */
//具体装饰类
public class TShirts extends Finery{
    public void show(){
        super.show();
        System.out.println("大体恤");
    }
}
