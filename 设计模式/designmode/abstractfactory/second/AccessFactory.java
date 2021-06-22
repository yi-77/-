package com.designmode.abstractfactory.second;

/**
 * @author 王辉
 * @date 2021/6/22 - 18:14
 */
public class AccessFactory implements IFactory {
    public IUser createUser()
    {
        return new AccessIUser();
    }
}
