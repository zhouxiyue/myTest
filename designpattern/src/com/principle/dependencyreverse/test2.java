package com.principle.dependencyreverse;

public class test2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new Email2());
        person2.receive(new WeChat());
    }
}

interface IReceive{
    public String getinfo();
}

class Email2 implements IReceive{
    public String getinfo(){
        return "message:hello";
    }
}

class WeChat implements IReceive{
    public String getinfo(){
        return "wechat:hello";
    }
}

class Person2{
    public void receive(IReceive iReceive){
        System.out.println(iReceive.getinfo());
    }
}