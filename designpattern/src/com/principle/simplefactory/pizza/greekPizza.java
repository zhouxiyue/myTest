package com.principle.simplefactory.pizza;

public class greekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare for greek pizza");
    }
}
