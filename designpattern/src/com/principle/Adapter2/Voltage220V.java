package com.principle.Adapter2;

public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("voltage: "+src+" V");
        return src;
    }
}
