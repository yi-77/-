package com.designmode.facade.third;

/**
 * @author 王辉
 * @date 2021/5/28 - 16:04
 */

//外观类
public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    //构造方法
    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    //methodA
    public void methodA() {
        one.methodOne1();
        two.methodTwo1();
        three.methodThree1();
        four.methonFour1();
    }

    //methodB
    public void methodB(){
        one.methodOne2();
        two.methodTwo2();
        three.methodThree2();
        four.methonFour2();
    }




}
