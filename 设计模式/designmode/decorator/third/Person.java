package com.designmode.decorator.third;

/**
 * @author 王辉
 * @date 2021/6/9 - 18:11
 */
//具体构建类：人类    （这里由于只有一个具体构建类，所以可以将具体构建类和抽象构件类放在一起）
public class Person {
    private String name;
    //构造方法1
    public Person(){

    }
    //构造方法2
    public Person(String name){
        this.name=name;
    }
    //定义在父类中的show()方法
    public void show(){
        System.out.println("装扮的"+ name);
    }
}
