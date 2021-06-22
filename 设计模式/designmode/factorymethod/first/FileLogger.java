package com.designmode.factorymethod.first;

/**
 * @author 王辉
 * @date 2021/6/18 - 16:23
 */
//具体产品:文件日志记录器
public class FileLogger extends Logger {
    public void writerLog(){
        System.out.println("文件日志记录");
    }
}
