package com.designmode.observer.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王辉
 * @date 2021/6/22 - 16:47
 */
//前台秘书类
public class Secretary {
    private List<StockObserver> observers	= new ArrayList<StockObserver>();
    private String				action;

    public void attach(StockObserver observer)
    {
        observers.add(observer);
    }

    public void announce()
    {
        for (StockObserver obj : observers)
        {
            obj.update();
        }
    }

    public String getAction()
    {
        return action;
    }

    public void setAction(String action)
    {
        this.action = action;
    }
}
