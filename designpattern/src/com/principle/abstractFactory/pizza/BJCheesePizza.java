package com.principle.abstractFactory.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("abstract factory");
        System.out.println("prepare for BJCheesePizza");
    }
}
