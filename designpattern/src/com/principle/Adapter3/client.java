package com.principle.Adapter3;

public class client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void operation1() {
                System.out.println("override operation1");
            }
        };
        abstractAdapter.operation1();
    }
}
