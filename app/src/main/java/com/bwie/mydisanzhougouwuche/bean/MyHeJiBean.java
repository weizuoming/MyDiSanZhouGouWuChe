package com.bwie.mydisanzhougouwuche.bean;

/**
 * Created by admin on 2018/3/2.
 */

public class MyHeJiBean {
    private String price;
    private int num;

    public MyHeJiBean(String price, int num) {
        this.price = price;
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
