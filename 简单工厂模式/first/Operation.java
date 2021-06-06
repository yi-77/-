package com.designmode.ea_factory.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author 王辉
 * @date 2021/6/3 - 9:42
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


    public static void main(String[] args) {
        InputStreamReader stdin=null;
        BufferedReader bufferedReader=null;

        stdin=new InputStreamReader(System.in);
        bufferedReader=new BufferedReader(stdin);

        try {
            System.out.println("请输入数字A:");
            String numberA=bufferedReader.readLine();
            System.out.println("请选择运算符（+ - * /）");
            String operator=bufferedReader.readLine();
            System.out.println("请选择数字B：");
            String numberB=bufferedReader.readLine();

            String result=String.valueOf(Operation.getResult(Double.parseDouble(numberA),Double.parseDouble(numberB),
                    operator));
            System.out.println("结果是："+result);

        }catch (Exception ex){
            System.out.println("您输入的结果有误："+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
