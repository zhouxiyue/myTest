package com.principle.Singleton.type1;

public class Singleton01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}

//饿汉式（静态变量）
class Singleton{
    private  Singleton(){}
    private final static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
