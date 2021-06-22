package com.designmode.decorator.first;

/**
 * @author 王辉
 * @date 2021/6/7 - 18:58
 */
public class Main {
    public static void main(String[] args) {
        Person person=new Person("小菜");
        System.out.println("第一次穿搭：");
        person.wearTShirts();
        person.wearBigTrouser();
        person.wearLeatherShoes();
        person.show();

        System.out.println("第二次穿搭：");
        person.wearSneakers();
        person.wearSuit();
        person.wearTie();
        person.show();
    }
}
