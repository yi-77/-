package com.designmode.proxy.first;

/**
 * @author 王辉
 * @date 2021/6/10 - 11:10
 */
public class Pursuit {
    SchoolGirl schoolGirl;
    public Pursuit(SchoolGirl schoolGirl){
        this.schoolGirl=schoolGirl;
    }
    public void giveDolls(){
        System.out.println(schoolGirl.name+"送你洋娃娃");
    }
    public void giveFlowers(){
        System.out.println(schoolGirl.name+"送你鲜花");
    }
    public void giveChocolate(){
        System.out.println(schoolGirl.name+"送你鲜花");
    }
}
