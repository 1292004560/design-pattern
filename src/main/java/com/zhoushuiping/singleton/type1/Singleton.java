package com.zhoushuiping.singleton.type1;

public class Singleton {


    private final static Singleton singletonInstance = new Singleton();

    private Singleton(){
        //防止外部new
    }

    public static Singleton getSingletonInstance(){
        return  singletonInstance;
    }
}
