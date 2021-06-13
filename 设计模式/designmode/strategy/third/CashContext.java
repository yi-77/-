package com.designmode.strategy.third;

/**
 * @author 王辉
 * @date 2021/6/6 - 14:47
 */
public class CashContext {
    //定义CashSuper类型的cashSuper变量
    private CashSuper cashSuper;
    //构造方法1
    public CashContext(CashSuper cashSuper){
        this.cashSuper=cashSuper;
    }
    //构造方法2
    public CashContext(String type){
        if ("正常".equals(type)){
            cashSuper=new CashNormal();
        }else if ("打8折".equals(type)){
            cashSuper=new CashRebate(0.8);
        }else if ("满300减100".equals(type)){
            cashSuper=new CashReturn(300,100);
        }
    }


    //策略模式在此例中的独特体现
    public double acceptCash(double money){
        return cashSuper.acceptCash(money); //此处的cashSuper是上面变量中的cashSuper
    }

}
