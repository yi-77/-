package com.designmode.factorymethod.first;

/**
 * @author 王辉
 * @date 2021/6/18 - 16:24
 */
//抽象工厂：日志记录器抽象类
public abstract class LoggerFactory {
    public abstract Logger createLogger();
}
