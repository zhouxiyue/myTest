package com.principle.abstractFactory.pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("abstract factory");
        System.out.println("prepare for BJPepperPizza");
    }
}
