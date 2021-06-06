package com.designmode.ea_factory.second;

/**
 * @author 王辉
 * @date 2021/6/3 - 11:28
 */
public class Operation {
    public static double getResult(double numberA,double numberB,String operator){
        double result=0;
        if ("+".equals(operator)){
            result=numberA+numberB;
        }else if ("-".equals(operator)){
            result=numberA-numberB;
        }else if ("*".equals(operator)){
            result=numberA*numberB;
        }else if ("/".equals(operator)){
            result=numberA/numberB;
        }

        return result;
    }
}
