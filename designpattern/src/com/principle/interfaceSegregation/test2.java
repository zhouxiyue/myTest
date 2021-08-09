package com.principle.interfaceSegregation;

public class test2 {
    public static void main(String args[]){
        A_improve a_improve = new A_improve();
        a_improve.depend1(new B_improve());
        a_improve.depend2(new B_improve());
        a_improve.depend3(new B_improve());

        C_improve c_improve = new C_improve();
        c_improve.depend1(new D_improve());
        c_improve.depend4(new D_improve());
        c_improve.depend5(new D_improve());
    }
}

interface interface1_improve{
    void operation1();
}

interface interface2_improve{
    void operation2();
    void operation3();
}

interface interface3_improve{
    void operation4();
    void operation5();
}

class B_improve implements interface1_improve,interface2_improve{
    public void operation1(){
        System.out.println("B implements operation1");
    }
    public void operation2(){
        System.out.println("B implements operation2");
    }
    public void operation3(){
        System.out.println("B implements operation3");
    }
}

class D_improve implements interface1_improve,interface3_improve{
    public void operation1(){
        System.out.println("D implements operation1");
    }
    public void operation4(){
        System.out.println("D implements operation4");
    }
    public void operation5(){
        System.out.println("D implements operation5");
    }
}

class A_improve{
    public void depend1(interface1_improve i){
        i.operation1();
    }

    public void depend2(interface2_improve i){
        i.operation2();
    }

    public void depend3(interface2_improve i){
        i.operation3();
    }
}

class C_improve{
    public void depend1(interface1_improve i){
        i.operation1();
    }

    public void depend4(interface3_improve i){
        i.operation4();
    }

    public void depend5(interface3_improve i){
        i.operation5();
    }
}