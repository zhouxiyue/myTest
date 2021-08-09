package com.principle.Builder;

public class client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        HighHouse highHouse = new HighHouse();
        HouseDirector houseDirector1 = new HouseDirector(highHouse);
        House house1 = houseDirector1.constructHouse();
    }
}
