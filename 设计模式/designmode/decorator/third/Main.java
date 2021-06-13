package com.designmode.decorator.third;

/**
 * @author 王辉
 * @date 2021/6/9 - 18:31
 */
public class Main {
    public static void main(String[] args) {
        Person person=new Person("小菜");

        System.out.println("第一种装扮：");
        TShirts tShirts=new TShirts();
        BigTrouser bigTrouser=new BigTrouser();
        Sneakers sneakers=new Sneakers();

        //这里应该使用了某种算发。有一种层层嵌套的感觉。下面前三句代码并没有调用show()方法（没有任何输出语句），只是在
        //做着传参的工作，直到第四句__引用sneakers调用了Sneakers类中的show()方法，而Sneakers类中的show()方法中第一句
        //并不是输出语句，而是通过super关键字调用了其父类中的show()方法，这时父类中的show()方法又指向了BigTrouser类中
        //的show()方法（这里父类中的show()方法为什么不继续指向Sneakers类而是指向了BigTrouser类我现在并未得知），
        // 而BigTrouser中的show()方法情况和在Sneakers类中一样，，并以此类推。直到Finery类中的show()方法
        //调用Person类中的show()方法，并输出语句后，Tshirts类，BigTrouser类，Sneakers类中的show()方法中的语句才相继输出。
        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        sneakers.show();


        System.out.println("第二种装扮");
        Suit suit=new Suit();
        Tie tie=new Tie();
        LeatherShoes leatherShoes =new LeatherShoes();

        suit.decorate(person);
        tie.decorate(suit);
        leatherShoes.decorate(tie);
        leatherShoes.show();

    }
}
