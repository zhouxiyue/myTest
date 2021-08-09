package com.principle.interfaceSegregation;

public class test1 {
}

interface interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements interface1{
    public void operation1(){
        System.out.println("B implements operation1");
    }
    public void operation2(){
        System.out.println("B implements operation2");
    }
    public void operation3(){
        System.out.println("B implements operation3");
    }
    public void operation4(){
        System.out.println("B implements operation4");
    }
    public void operation5(){
        System.out.println("B implements operation5");
    }
}

class A{
    public void depend1(interface1 i){
        i.operation1();
    }

    public void depend2(interface1 i){
        i.operation2();
    }

    public void depend3(interface1 i){
        i.operation3();
    }
}

class C{
    public void depend1(interface1 i){
        i.operation1();
    }

    public void depend4(interface1 i){
        i.operation4();
    }

    public void depend5(interface1 i){
        i.operation5();
    }
}