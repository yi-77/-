package com.designmode.decorator.second;

/**
 * @author 王辉
 * @date 2021/6/8 - 12:29
 */
//具体构件类：窗体类         （构件：即系统中实际存在的可更换部分。）
class Windows extends Component {
    public void display(){
        System.out.println("显示窗体！");
    }
}
