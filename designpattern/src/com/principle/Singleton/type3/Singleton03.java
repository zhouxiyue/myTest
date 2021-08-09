package com.principle.Singleton.type3;

public class Singleton03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}

//懒汉式（线程不安全）
class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(null == instance){
            instance = new Singleton();
        }
        return instance;
    }
}
