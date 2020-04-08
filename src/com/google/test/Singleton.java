package com.google.test;

public class Singleton {
    private static Singleton singleton=new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton(){
        return singleton;
    }


    public void sayHello(){
        System.out.println("hello");
    }

}
