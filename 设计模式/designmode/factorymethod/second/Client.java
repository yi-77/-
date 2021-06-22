package com.designmode.factorymethod.second;

/**
 * @author 王辉
 * @date 2021/6/18 - 18:29
 */
//客户端类
public class Client {
    public static void main(String[] args) {
        UgFactory ugFactory=new UgFactory();
        LeiFeng leiFeng=ugFactory.leiFeng();
        leiFeng.sweep();
        leiFeng.wash();
        leiFeng.cookDinner();
    }
}
