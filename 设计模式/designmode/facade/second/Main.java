package com.designmode.facade.second;

/**
 * @author 王辉
 * @date 2021/5/28 - 15:19
 */
public class Main {
    //客户端代码
    public static void main(String[] args) {
        Fund fund=new Fund();
        fund.buyFund();
        fund.sellFund();
        System.out.println("--------------------");
        //System.out.println(fund.stock1);    //输出为：com.designmode.facade.second.Stock1@7291c18f
    }

}
