package com.principle.abstractFactory.order;

import com.principle.abstractFactory.pizza.Pizza;

public interface abstractFactory {
    public Pizza createPizza(String orderType);
}
