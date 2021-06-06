package com.designmode.Strategy.first;

/**
 * @author 王辉
 * @date 2021/6/4 - 22:13
 */
public class Cash02 {
    private double total=0;
    private int selectedIndex=0;

    public void selectFormLoad(){
        String[] selectForm={"正常收费","打八折","打七折","打六折"};
        selectedIndex=0;
    }
    public void submit(int num,double price){
        double totalPrice=0;
        switch (selectedIndex){
            case 0:
                totalPrice=num*price;
                break;
            case 1:
                totalPrice=num*price*0.8;
                break;
            case 2:
                totalPrice=num*price*0.7;
                break;
            case 3:
                totalPrice=num*price*0.6;
                break;
        }
        total+=totalPrice;
        System.out.println("单价："+price+"数量："+"合计："+totalPrice);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }
}
