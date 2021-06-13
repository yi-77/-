package com.designmode.decorator.third;

/**
 * @author 王辉
 * @date 2021/6/9 - 18:16
 */
//抽象装饰类
public class Finery extends Person {
    private Person component;
    public void decorate(Person component){
        this.component=component;
    }
    public void show(){
        if (null!=component){
            component.show();
        }
    }

}
