package com.designmode.strategy.second;

/**
 * @author 王辉
 * @date 2021/6/6 - 11:08
 */

//                                         使用简单工厂模式实现

public class Main {
    static double total=0;
    public static void main(String[] args) {
        consume("正常",1,1000);  //此处是调用consume()方法，其完整语句为Main.consume();
        Main.consume("打8折",1,1000);
        consume("满300减100",1,1000);
        //此处因为total变量是实例变量（定义在类体内，方法体之外），所以在一次方法调用结束后并不会清零，所以会将三次方法调用的结果都相加，得到最终的结果
        System.out.println("总价"+total);
    }

    public static void consume(String type,int num,double price){
        //等式左边调用工厂类中的creatCash()方法,通过传递不同类型的参数--type，在工厂类中创建不同的对象。
        //等式左边的cashSuper接收来自工厂类中返回的指向 新创建的对象 的内存地址。此时cashSuper也指向了在工厂类中新创建的对象
        CashSuper cashSuper=CashFactory.createCash(type);  //注意此处等式左边接收的类型必须为父类型--CashSuper
        //初始化变量totalPrice
        double totalPrice=0;
        //等式右边通过新引用cashSuper调用acceptCash方法，并将num*price的最终结果作为参数传递给acceptCash方法（此处的acceptCash方法同时存在于接口于实现类中，
        // 即相当于子类继承了父类，并重写了父类中的方法。此时若添加新的子类，则此处的方法不需要修改，体现了java编程中的多态性）
        //等式左边用于接收acceptCash方法返回的值
        totalPrice=cashSuper.acceptCash(num*price);
        total+=totalPrice;
        System.out.println("数量："+num+"价钱："+price+"合计："+totalPrice);

    }
}
