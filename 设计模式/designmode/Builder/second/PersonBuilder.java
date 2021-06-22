package com.designmode.Builder.second;

import java.awt.*;

/**
 * @author 王辉
 * @date 2021/6/22 - 16:15
 */
//画人的抽象类
public abstract class PersonBuilder {
    protected Graphics g;

    public PersonBuilder(Graphics g)
    {
        this.g = g;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();
}
