package com.google.test;

public class Singleton2 {
    private static Singleton2 singleton2=new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return singleton2;
    }

    public static void  sayHello(){
        System.out.println("lol");
    }


}
