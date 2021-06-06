package com.designmode.Strategy.first;

/**
 * @author 王辉
 * @date 2021/6/4 - 16:08
 */
public class Cash {
    private double total=0;
    public void submit(int num,double price){
        double totalPrice=num*price;
        total+=totalPrice;

        System.out.println("单价："+price+"数量："+num+"合计："+totalPrice);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
