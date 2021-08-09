package com.principle.simplefactory.order;

import com.principle.simplefactory.pizza.Pizza;
import com.principle.simplefactory.pizza.cheesePizza;
import com.principle.simplefactory.pizza.greekPizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
//    public OrderPizza() {
//        Pizza pizza = null;
//        String ordertype;
//        do {
//            ordertype = gettype();
//            if (ordertype.equals("greek")) {
//                pizza = new greekPizza();
//                pizza.setName("greek");
//            } else if (ordertype.equals("cheese")) {
//                pizza = new cheesePizza();
//                pizza.setName("cheese");
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    public OrderPizza(simpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    simpleFactory simpleFactory;
    Pizza pizza=null;
    public void setSimpleFactory(simpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do{
            orderType = gettype();
            pizza=this.simpleFactory.createPizza(orderType);
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
