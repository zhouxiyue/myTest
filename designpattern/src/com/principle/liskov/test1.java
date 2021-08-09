package com.principle.liskov;

public class test1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.function1(11,3));
        System.out.println("1-8="+a.function1(1,8));

        B b = new B();
        System.out.println("11+3="+b.function1(11,3));
        System.out.println("11-3="+b.function3(11,3));
        System.out.println("1+8="+b.function1(1,8));
        System.out.println("11+3+9="+b.function2(11,3));
    }
}

class Base{

}

class A extends Base{
    public int function1(int a,int b){
        return a-b;
    }
}

class B extends Base{
    private A a = new A();
    public int function1(int a,int b){
        return a+b;
    }
    public int function2(int a,int b){
        return function1(a,b)+9;
    }

    public int function3(int a,int b){
        return this.a.function1(a,b);
    }
}