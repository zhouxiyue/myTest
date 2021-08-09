package com.principle.simplefactory2.order;

import com.principle.simplefactory2.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza=null;
        String orderType = "";
        do{
            orderType = gettype();
            pizza = createPizza(orderType);
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

    abstract Pizza createPizza(String orderType);

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
