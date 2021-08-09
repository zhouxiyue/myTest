package com.principle.Singleton.type8;

public class Singleton08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.Instance;
        Singleton singleton2 = Singleton.Instance;
        System.out.println(singleton1==singleton2);
    }
}
//枚举方式实现
enum Singleton{
    Instance;
    public void sayOK(){
        System.out.println("ok");
    }
}
