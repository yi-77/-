package com.designmode.proxy.second;

/**
 * @author 王辉
 * @date 2021/6/13 - 11:18
 */

//代理类
public class Proxy implements GiveGift {
    Pursuit gg;
    public Proxy(SchoolGirl mm){
        gg=new Pursuit(mm);     //将指向SchoolGirl类的引用mm传到Pursuit类中
    }

    public void giveDolls(){
        gg.giveDolls();
    }
    public void giveFlowers(){
        gg.giveFlowers();
    }
    public void giveChocolate(){
        gg.giveChocolate();
    }
}
