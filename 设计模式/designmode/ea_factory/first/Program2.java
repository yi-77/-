package com.designmode.ea_factory.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 王辉
 * @date 2021/6/3 - 8:54
 */
public class Program2 {
    public static void main(String[] args) {
        InputStreamReader stdin = null;
        BufferedReader bufferedReader = null;

        stdin = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(stdin);

        try {
            System.out.println("请输入数字A:");
            String numberA = bufferedReader.readLine();
            System.out.println("请选择运算符（+ - * /）：");
            String operator = bufferedReader.readLine();
            System.out.println("请选择数字B：");
            String numberB = bufferedReader.readLine();

            String result = "";

            if ("+".equals(operator)) {
                result = String.valueOf(Integer.parseInt(numberA) + Integer.parseInt(numberB));
            }
            if ("-".equals(operator)) {
                result = String.valueOf(Integer.parseInt(numberA) - Integer.parseInt(numberB));
            }
            if ("*".equals(operator)) {
                result = String.valueOf(Integer.parseInt(numberA) * Integer.parseInt(numberB));
            }
            if ("/".equals(operator)) {
                if (!"0".equals(numberB)) {
                    result = String.valueOf(Integer.parseInt(numberA) / Integer.parseInt(numberB));
                } else {
                    result = "除数不能为0";
                }

            }

            System.out.println("结果为：" + result);


        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            System.out.println("您输入有误" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
