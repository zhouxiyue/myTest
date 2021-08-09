package com.principle.simplefactory.pizza;

public class cheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare for cheese pizza");
    }
}
