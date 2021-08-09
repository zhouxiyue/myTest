package com.principle.Singleton.type2;

public class Singleton02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}

//饿汉式（静态代码块）
class Singleton{
    private Singleton(){}
    static{//在静态代码块中创建代理对象
        instance = new Singleton();
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        return instance;
    }
}

