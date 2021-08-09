package com.principle.abstractFactory.order;

import com.principle.abstractFactory.pizza.BJCheesePizza;
import com.principle.abstractFactory.pizza.BJPepperPizza;
import com.principle.abstractFactory.pizza.Pizza;

public class BJFactory implements abstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
