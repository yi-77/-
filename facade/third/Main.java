package com.designmode.facade.third;

/**
 * @author 王辉
 * @date 2021/5/28 - 16:19
 */

//                                          外观模式

public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.methodA();
        facade.methodB();
    }
}
