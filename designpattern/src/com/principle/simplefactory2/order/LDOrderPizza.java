package com.principle.simplefactory2.order;

import com.principle.simplefactory2.pizza.LDCheesePizza;
import com.principle.simplefactory2.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDCheesePizza();
        }
        return pizza;
    }
}
