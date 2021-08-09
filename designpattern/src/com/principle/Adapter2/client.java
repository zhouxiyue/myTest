package com.principle.Adapter2;

public class client {
    public static void main(String[] args) {
        phone phone = new phone();
        phone.charging(new VlotageAdapter(new Voltage220V()));
    }
}
