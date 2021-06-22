package com.designmode.factorymethod.second;

/**
 * @author 王辉
 * @date 2021/6/18 - 18:23
 */
//具体工厂类
public class UgFactory implements LfFactory {
    public LeiFeng leiFeng(){
        LeiFeng leiFeng=new UnderGraduate();
        return leiFeng;
    }
}
