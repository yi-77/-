package com.designmode.proxy.second;

/**
 * @author 王辉
 * @date 2021/6/13 - 11:14
 */

//追求者类
public class Pursuit implements GiveGift {
    SchoolGirl mm;       //此处的mm指向SchoolGirl类
    public Pursuit(SchoolGirl mm){
        this.mm=mm;
    }

    public void giveDolls(){
        System.out.println(mm.name+"送你洋娃娃");
    }
    public void giveFlowers(){
        System.out.println(mm.name+"送你鲜花");
    }
    public void giveChocolate(){
        System.out.println(mm.name+"送你巧克力");
    }
}
