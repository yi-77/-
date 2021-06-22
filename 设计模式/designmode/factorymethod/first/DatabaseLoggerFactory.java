package com.designmode.factorymethod.first;


/**
 * @author 王辉
 * @date 2021/6/18 - 16:24
 */
//具体工厂：数据库日志记录器工厂类
public class DatabaseLoggerFactory extends LoggerFactory{
    public Logger createLogger(){
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger=new DatabaseLogger();
        //初始化数据库日志记录器对象，代码省略
        return logger;
    }

}
