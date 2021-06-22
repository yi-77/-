package com.designmode.templatemethod.first;

/**
 * @author 王辉
 * @date 2021/6/20 - 17:41
 */
//学生甲抄的试卷
public class TestPaperA extends TestPaper {
    public void testQuestion1(){
        super.testQuestion1();
        System.out.println("答案： b");
    }
    public void testQuestion2(){
        super.testQuestion2();
        System.out.println("答案：b");
    }
    public void testQuestion3(){
        super.testQuestion3();
        System.out.println("答案：b");
    }
}
