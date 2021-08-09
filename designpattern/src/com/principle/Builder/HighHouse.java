package com.principle.Builder;

public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("HighHouse buildBasic");
    }

    @Override
    public void buildWall() {
        System.out.println("HighHouse buildWall");
    }

    @Override
    public void roofed() {
        System.out.println("HighHouse roofed");
    }
}
