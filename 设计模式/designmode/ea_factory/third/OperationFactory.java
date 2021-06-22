package com.designmode.ea_factory.third;

/**
 * @author 王辉
 * @date 2021/6/3 - 20:42
 */
public class OperationFactory {
    public static Operation creatOperation(String operate){
        Operation oper=null;
        if ("+".equals(operate)){
            oper=new OperationAdd();   //如果Main类中引用传过来的运算符是"+",则会执行这一句，即Operation oper=new OperationAdd();   然后再Main类中通过引用oper对
                                       //Operation类中的setNumberA和setNumberB方法进行赋值，进而在OperationAdd类中计算最终结果，并通过调用getResult方法返回到Main类中
        }else if ("-".equals(operate)){
            oper=new OperationSub();
        }else if ("*".equals(operate)){
            oper=new OperationMul();
        }else if ("/".equals(operate)){
            oper=new OperationDiv();
        }
        //将指向对象的引用--oper的内存地址返回
        return oper;
    }
}
