package com.designmode.decorator.second;

/**
 * @author 王辉
 * @date 2021/6/8 - 12:46
 */

//滚动条装饰类：具体装饰类
class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);   //将component传入到父类构造方法中
    }

    public void display() {
        this.setScrollBar();    //调用setScrollBar()方法
        super.display();    //调用父类中的display()方法
    }

    public void setScrollBar() {
        System.out.println("为构建增加滚动条");
    }
}
