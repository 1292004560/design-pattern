package com.zhoushuiping.singleton.type1;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getSingletonInstance();

        Singleton singleton2 = Singleton.getSingletonInstance();

        System.out.println("singleton1   "+singleton1.hashCode());
        System.out.println("singleton2  "+singleton2.hashCode());
    }
}
