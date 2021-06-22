package com.designmode.abstractfactory.first;

/**
 * @author 王辉
 * @date 2021/6/22 - 18:04
 */
public class Main {
    public static void main(String[] args)
    {
        User user = new User();

        SqlServerUser su = new SqlServerUser();

        su.insert(user);

        su.getUser(1);
    }
}
