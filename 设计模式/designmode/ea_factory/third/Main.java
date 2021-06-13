package com.designmode.ea_factory.third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//                                          简单工厂模式

/**
 * @author 王辉
 * @date 2021/6/3 - 20:47
 */
public class Main {
    public static void main(String[] args) {
        InputStreamReader stdin=null;
        BufferedReader bufferedReader=null;

        stdin=new InputStreamReader(System.in);
        bufferedReader=new BufferedReader(stdin);

        try {
            System.out.println("请输入数字A：");
            double numberA=Double.parseDouble(bufferedReader.readLine());
            System.out.println("请选择运算符（+ - * /）");
            String operator=bufferedReader.readLine();
            System.out.println("请输入数字B：");
            Double numberB=Double.parseDouble(bufferedReader.readLine());


            //等式右边调用工厂类中的creatOperation()方法，通过上面程序中用户输入的运算符operator将参数传递到creatOperation()方法中，
            //该方法创建相应的对象，并由此处等式左边的oper接收crestOperation()方法返回的指向新对象的内存地址
            Operation oper=OperationFactory.creatOperation(operator);         //简单工厂模式的核心语句
            //通过oper调用新创建的对象，并将上面程序中用户传递的numberA和numberB的值通过setter方法传递到Operation类当中
            oper.setNumberA(numberA);
            oper.setNumberB(numberB);
            //通过oper调用对象的getResult方法计算出最终结果
            System.out.println("结果是："+oper.getResult());


        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
