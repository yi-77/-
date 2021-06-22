package com.designmode.facade.second;

/**
 * @author 王辉
 * @date 2021/5/28 - 15:31
 */
public class Fund {
    //基金类

    //引用
    Stock1 stock1;
    Stock2 stock2;
    Stock3 stock3;
    NationalDebt1 nationalDebt1;
    Realty1 realty1;

    //构造方法
    public Fund(){
        stock1=new Stock1();
        stock2=new Stock2();
        stock3=new Stock3();
        nationalDebt1=new NationalDebt1();
        realty1=new Realty1();
    }

    //客户买入基金,让基金方去买入股票，国债，房地产。即在基金方法中去调用股票，国债，房地产类中的方法
    public void buyFund(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
        nationalDebt1.buy();
        realty1.buy();
    }

    //客户卖出基金
    public void sellFund(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
        nationalDebt1.sell();
        realty1.sell();
    }

}
