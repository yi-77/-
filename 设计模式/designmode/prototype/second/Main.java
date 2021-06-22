package com.designmode.prototype.second;

/**
 * @author 王辉
 * @date 2021/6/20 - 14:48
 */
//                              原型模式
public class Main {
    public static void main(String[] args) {
        Resume resume=new Resume("大鸟");
        resume.setPersonalInfo("男","22");
        resume.setWorkExperience("2010","xx公司");
        resume.display();


        Resume resume_new=resume.clone();
        resume_new.setPersonalInfo("女","19");
        resume_new.display();
    }
}
