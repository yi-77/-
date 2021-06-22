package com.designmode.decorator.second;

/**
 * @author 王辉
 * @date 2021/6/8 - 12:37
 */

//构件装饰类：抽象装饰类
    //--
class ComponentDecorator extends Component{
    private Component component;    //维持对抽象构件类型对象的引用
    public ComponentDecorator(Component component){     //注入抽象构件类型的对象
        this.component=component;
    }
    public void display(){
        //在第一次的Client()方法中，此处的component指向windows对象，即它会调用Windows类中的display()方法
        //在第二次的Client()方法中，此处的component再“第一次装饰时”先存储了指向Windows()类的内存地址，然后在“第二次装饰时”
        //又存储了指向ScrollBarDecorator类的内存地址，当用第二次装饰时的对象调用display()方法时，此处会跳转到ScrollBarDecorator类
        //，然后再ScrollBarDecorator类中再次通过component调用display()方法时则跳转到了Windows类中。
        component.display();
    }

}
