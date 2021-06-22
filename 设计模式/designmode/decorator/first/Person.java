package com.designmode.decorator.first;

/**
 * @author 王辉
 * @date 2021/6/7 - 18:48
 */
public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }
    public void wearTShirts(){
        System.out.println("大体恤");
    }
    public void wearBigTrouser(){
        System.out.println("大裤衩");
    }
    public void wearSneakers(){
        System.out.println("破球鞋");
    }
    public void wearSuit(){
        System.out.println("西装");
    }
    public void wearTie(){
        System.out.println("领带");
    }
    public void wearLeatherShoes(){
        System.out.println("皮鞋");
    }
    public void show(){
        System.out.println("装扮的："+name);
    }
}
