package com.principle.simplefactory2.order;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        do{
            if(s.equals("bj")){
                new BJOrderPizza();
            }else if(s.equals("ld")){
                new LDOrderPizza();
            }else{
                break;
            }
        }while(true);
    }
}
