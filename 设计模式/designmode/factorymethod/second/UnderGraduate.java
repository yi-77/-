package com.designmode.factorymethod.second;

/**
 * @author 王辉
 * @date 2021/6/18 - 18:11
 */
//具体产品类：大学生类
public class UnderGraduate implements LeiFeng {
    public void sweep(){
        System.out.println("大学生为老人扫地");
    }
    public void wash(){
        System.out.println("大学生为老人洗衣");
    }
    public void cookDinner(){
        System.out.println("大学生为老人做饭");
    }
}
