package com.principle.prototype;

public class client {
    public static void main(String[] args) {
        sheep sheep1 = new sheep("tom",1,"white");
        sheep1.friend = new sheep("jerry",2,"black");

        sheep sheep2 = (sheep)sheep1.clone();
        sheep sheep3 = (sheep)sheep1.clone();
        sheep sheep4 = (sheep)sheep1.clone();
        sheep sheep5 = (sheep)sheep1.clone();
        System.out.println(sheep2.toString()+" "+sheep2.friend.hashCode());
        System.out.println(sheep3.toString()+" "+sheep3.friend.hashCode());
        System.out.println(sheep4.toString()+" "+sheep4.friend.hashCode());
        System.out.println(sheep5.toString()+" "+sheep5.friend.hashCode());
    }
}
