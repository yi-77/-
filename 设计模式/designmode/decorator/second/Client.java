package com.designmode.decorator.second;

/**
 * @author 王辉
 * @date 2021/6/8 - 18:11
 */

/*
* 如果需要在原有系统中添加一个新的具体构建类或新的具体装饰类，无需修改现有类代码，只需将他们作为抽象构建类或
* 抽象装饰类的子类写入即可
* */



class Client {
/*

    */
/*要求1：希望得到一个有滚动条的窗口
    *先定义了一个Windows类型的具体构建的对象component，然后将component作为构造函数的参数注入到具体装饰类ScrollBarDecorator
    * 中，得到一个具体装饰之后的对象componentST,在调用componentST的display()方法。然后就得到了一个有滚动条的窗口
    * *//*

    public static void main(String[] args) {
        Component component,componentST;    //使用抽象构件定义
        component=new Windows();    //定义具体构件
        componentST=new ScrollBarDecorator(component);   //定义装饰后的构件
        //调用ScrollBarDecorator类中的display()方法，
        componentST.display();
    }

*/


    /*
    * 要求2：得到一个既有滚动条又有黑色边框的窗体
    *        --将装饰一次之后的componentST对象注入另一个装饰类BlackBorderDecorator中，得到一个经过两次装饰的对象component
    *           componentSS，再调用componentBB的display()方法即可得到一个既有滚动条又有黑色边框的窗体。
    * */
    public static void main(String[] args) {
        Component component,componentST,componentSS;    //全部使用抽象构件定义
        component=new Windows();
        componentST=new ScrollBarDecorator(component);
        componentSS=new BlackBorderDecorator(componentST);
        componentSS.display();

    }
}
