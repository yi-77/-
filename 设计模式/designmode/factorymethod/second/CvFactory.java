package com.designmode.factorymethod.second;

/**
 * @author 王辉
 * @date 2021/6/18 - 18:28
 */
//具体工厂类
public class CvFactory implements LfFactory {
    public LeiFeng leiFeng(){
        LeiFeng leiFeng=new CommunityVolunteer();
        return leiFeng;
    }
}
