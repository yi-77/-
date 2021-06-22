package com.designmode.factorymethod.first;

/**
 * @author 王辉
 * @date 2021/6/18 - 16:25
 */
//                                      工厂方法模式
//客户端类
//  需求：对日志记录器进行设计
public class Client {
    public static void main(String[] args) {
        Logger logger;
        LoggerFactory loggerFactory;
        loggerFactory=new FileLoggerFactory();
        logger=loggerFactory.createLogger();
        logger.writerLog();
    }
}
