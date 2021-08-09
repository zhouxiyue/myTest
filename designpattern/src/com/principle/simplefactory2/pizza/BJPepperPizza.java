package com.principle.simplefactory2.pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("prepare for BJPepperPizza");
    }
}
