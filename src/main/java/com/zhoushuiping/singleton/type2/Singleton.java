package com.zhoushuiping.singleton.type2;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton(){}

    static {
        singletonInstance = new Singleton();
    }

    public static Singleton getSingletonInstance(){
        return singletonInstance;
    }
}

