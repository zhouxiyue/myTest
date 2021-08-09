package com.principle.abstractFactory.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("abstract factory");
        System.out.println("prepare for LDPepperPizza");
    }
}
