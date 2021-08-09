package com.principle.simplefactory.order;

import com.principle.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza2 {
    Pizza pizza=null;
    String orderType = "";
    public OrderPizza2(){
        do{
            orderType = gettype();
            pizza=simpleFactory.createPizza(orderType);
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
