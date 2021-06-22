package com.designmode.abstractfactory.second;

/**
 * @author 王辉
 * @date 2021/6/22 - 18:13
 */
public class AccessIUser implements IUser {
    public void insert(User user)
    {
        System.out.println("在Access中给User表增加一条记录");
    }

    public User getUser(int id)
    {
        System.out.println("在Access中根据ID得到User表一条记录");
        return null;
    }
}
