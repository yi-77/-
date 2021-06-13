package com.designmode.ea_factory.third;

/**
 * @author 王辉
 * @date 2021/6/3 - 20:13
 */
public class OperationDiv extends Operation{
    public double getResult() throws Exception{
        double result=0;
        if (getNumberB()==0){
            throw new Exception("除数不能为0");
        }
        result=getNumberA()/getNumberB();
        return result;
    }
}
