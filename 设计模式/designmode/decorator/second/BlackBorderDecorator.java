package com.designmode.decorator.second;

/**
 * @author 王辉
 * @date 2021/6/8 - 12:55
 */

//黑色边框类：具体装饰类
class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构建增加黑色边框");
    }
}
