package com.designmode.ea_factory.third;

/**
 * @author 王辉
 * @date 2021/6/3 - 11:52
 */
public class OperationAdd extends Operation {
    public double getResult(){
        double result=0;
        result=getNumberA()+getNumberB();
        return result;
    }

}
