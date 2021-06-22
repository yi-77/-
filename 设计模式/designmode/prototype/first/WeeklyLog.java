package com.designmode.prototype.first;

/**
 * @author 王辉
 * @date 2021/6/18 - 21:40
 */
//此处Object类作为抽象原型类，WeeklyLog类作为具体原型类
public class WeeklyLog implements Cloneable{
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //此处使用java语言提供的克隆机制，克隆方法clone();
    public WeeklyLog clone(){
        Object obj=null;
        try {
            obj=super.clone();
            return (WeeklyLog) obj;
        }catch (CloneNotSupportedException e){
            System.out.println("不支持复制");
            return null;
        }
    }
}
