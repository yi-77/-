package com.designmode.templatemethod.second;

/**
 * @author 王辉
 * @date 2021/6/20 - 21:15
 */
//                                          模板方法模式
//客户端代码
public class Main {
    public static void main(String[] args) {
        TestPaper student1=new TestPaperA();
        student1.testQuest1();
        student1.testQuest2();
        student1.testQuest3();

        System.out.println();

        TestPaper student2=new TestPaperB();
        student2.testQuest1();
        student2.testQuest2();
        student2.testQuest3();
    }
}
