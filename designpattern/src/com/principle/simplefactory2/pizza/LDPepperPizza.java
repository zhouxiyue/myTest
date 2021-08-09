package com.principle.simplefactory2.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("prepare for LDPepperPizza");
    }
}
