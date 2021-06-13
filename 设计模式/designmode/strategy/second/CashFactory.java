package com.designmode.strategy.second;

/**
 * @author 王辉
 * @date 2021/6/6 - 10:57
 */
public class CashFactory {
    public static CashSuper createCash(String type){
        CashSuper cs=null;     //此处等式左边的接收类型必须为父类型--CashSuper，不能为任何一个子类型，因为子类都继承了父类
        //通过Main类中传递不同的参数-type，继而创建不同的对象
        if ("正常".equals(type)){
            cs=new CashNormal();
        }else if ("打8折".equals(type)){
            cs=new CashRebate(0.8);
        }else if ("满300减100".equals(type)){
            cs=new CashReturn(300,100);
            }
        //cs作为引用保存指向对象的内存地址，并将内存地址返回
        return cs;
        }
    }
