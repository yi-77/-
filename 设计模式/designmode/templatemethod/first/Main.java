package com.designmode.templatemethod.first;

/**
 * @author 王辉
 * @date 2021/6/20 - 17:48
 */
public class Main {
    public static void main(String[] args) {
        TestPaperA testPaperA =new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        TestPaperB testPaperB=new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
