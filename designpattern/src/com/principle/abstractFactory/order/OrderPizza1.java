package com.principle.abstractFactory.order;

import com.principle.abstractFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza1 {
    abstractFactory abstractFactory;

    public OrderPizza1(abstractFactory abstractFactory){
        setAbstractFactory(abstractFactory);
    }

    private void setAbstractFactory(abstractFactory abstractFactory){
        Pizza pizza = null;
        String orderType = "";
        this.abstractFactory = abstractFactory;

        do{
            orderType = gettype();
            pizza = abstractFactory.createPizza(orderType);
            if(null!=pizza){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("fail");
                break;
            }
        }while(true);
    }

    private String gettype() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = bufferedReader.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
