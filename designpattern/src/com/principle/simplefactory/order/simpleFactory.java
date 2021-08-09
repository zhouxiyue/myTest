package com.principle.simplefactory.order;

import com.principle.simplefactory.pizza.Pizza;
import com.principle.simplefactory.pizza.cheesePizza;
import com.principle.simplefactory.pizza.greekPizza;

public class simpleFactory {
    public static Pizza createPizza(String ordertype){
        Pizza pizza = null;
        System.out.println("simple factory");
        if (ordertype.equals("greek")) {
            pizza = new greekPizza();
            pizza.setName("greek");
        } else if (ordertype.equals("cheese")) {
            pizza = new cheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}
