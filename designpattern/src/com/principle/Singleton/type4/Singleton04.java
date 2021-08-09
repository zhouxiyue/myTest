package com.principle.Singleton.type4;

public class Singleton04 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}

//懒汉式（线程安全，同步方法）
class Singleton{
    private Singleton(){}
    private static Singleton instance;
    public static synchronized Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
