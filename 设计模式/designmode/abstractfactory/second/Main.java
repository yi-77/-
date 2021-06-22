package com.designmode.abstractfactory.second;

/**
 * @author 王辉
 * @date 2021/6/22 - 18:15
 */
public class Main {
    public static void main(String[] args)
    {
        User user = new User();

        IFactory factory = new SqlServerFactory();

        IUser iu = factory.createUser();

        iu.insert(user);
        iu.getUser(1);
    }
}
