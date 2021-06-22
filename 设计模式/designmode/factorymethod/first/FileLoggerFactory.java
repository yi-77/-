package com.designmode.factorymethod.first;

/**
 * @author 王辉
 * @date 2021/6/18 - 16:25
 */
//具体工厂：文件日志记录器工厂类
public class FileLoggerFactory extends LoggerFactory{
    public Logger createLogger(){
        //创建文件日志记录器对象
        Logger logger=new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
