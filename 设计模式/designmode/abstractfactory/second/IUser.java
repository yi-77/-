package com.designmode.abstractfactory.second;

/**
 * @author 王辉
 * @date 2021/6/22 - 18:12
 */
public interface IUser {
    void insert(User user);

    User getUser(int id);
}
