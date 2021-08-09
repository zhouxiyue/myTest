package com.principle.abstractFactory.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("abstract factory");
        System.out.println("prepare for LDCheesePizza");
    }
}
