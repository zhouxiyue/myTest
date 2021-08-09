package com.principle.Singleton.type7;

public class Singleton07 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
    }
}


//静态内部类实现
class Singleton{
    private Singleton(){}
    private static class SingletonInstance{
        private static final Singleton Instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.Instance;
    }
}
