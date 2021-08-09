package com.principle.simplefactory2.order;

import com.principle.simplefactory2.pizza.BJCheesePizza;
import com.principle.simplefactory2.pizza.BJPepperPizza;
import com.principle.simplefactory2.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
