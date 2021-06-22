package com.designmode.strategy.third;

/**
 * @author 王辉
 * @date 2021/6/5 - 22:37
 */
//打折收费子类
public class CashRebate implements CashSuper {
    private double moneyRebate=1;
    public CashRebate(double moneyRebate){
        this.moneyRebate=moneyRebate;
    }
    public double acceptCash(double money){
        return money*moneyRebate;

    }

}
