package com.designmode.abstractfactory.second;

import com.designmode.abstractfactory.first.SqlServerUser;

/**
 * @author 王辉
 * @date 2021/6/22 - 18:14
 */
public class SqlServerFactory implements IFactory {
    public IUser createUser()
    {
        return new SqlServerIUser();
    }

}
