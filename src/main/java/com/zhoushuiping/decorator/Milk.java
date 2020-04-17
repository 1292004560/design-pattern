package com.zhoushuiping.decorator;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);

        setPrice(2.0f);
    }

}
