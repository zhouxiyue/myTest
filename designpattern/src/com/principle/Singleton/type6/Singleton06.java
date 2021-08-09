package com.principle.Singleton.type6;

public class Singleton06 {
}

//双重检查
class Singleton{
    private Singleton(){}
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        if(null==instance){
            synchronized (Singleton.class){
                if(null==instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
