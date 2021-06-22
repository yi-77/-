package com.designmode.abstractfactory.second;

/**
 * @author 王辉
 * @date 2021/6/22 - 18:12
 */
public class SqlServerIUser implements IUser {
    public void insert(User user)
    {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    public User getUser(int id)
    {
        System.out.println("在SQL Server中根据ID得到User表一条记录");
        return null;
    }
}
