package com.principle.Adapter;

public class client {
    public static void main(String[] args) {
        phone phone = new phone();
        phone.charging(new VlotageAdapter());
    }
}
