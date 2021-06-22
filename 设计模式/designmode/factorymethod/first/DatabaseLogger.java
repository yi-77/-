package com.designmode.factorymethod.first;

/**
 * @author 王辉
 * @date 2021/6/18 - 16:23
 */
//具体产品类：数据库日志记录器
public class DatabaseLogger extends Logger{
    public void writerLog(){
        System.out.println("数据库日志记录");
    }
}
