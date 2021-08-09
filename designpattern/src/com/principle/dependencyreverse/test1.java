package com.principle.dependencyreverse;

public class test1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getinfo(){
        return "message:hello";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getinfo());
    }
}
