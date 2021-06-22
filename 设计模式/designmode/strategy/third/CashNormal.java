package com.designmode.strategy.third;

/**
 * @author 王辉
 * @date 2021/6/5 - 22:34
 */
//正常收费子类
public class CashNormal implements CashSuper {
    public double acceptCash(double money){
        return money;
    }
}
