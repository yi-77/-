package com.designmode.factorymethod.second;

/**
 * @author 王辉
 * @date 2021/6/18 - 18:16
 */
//具体产品类：社区志愿者类
public class CommunityVolunteer implements LeiFeng {
    public void sweep(){
        System.out.println("社区志愿者为老人扫地");
    }
    public void wash(){
        System.out.println("社区志愿者为老人洗衣");
    }
    public void cookDinner(){
        System.out.println("社区志愿者为老人做饭");
    }
}
