package com.principle.simplefactory2.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("prepare for BJCheesePizza");
    }
}
