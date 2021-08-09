package com.principle.singleresponsibility;

public class test1 {
    public static void main(String args[]) {

    }
}

//在类的级别上遵守单一职责原则
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "is running on the road");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "is running on the water");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "is running on the air");
    }
}

//在方法的级别上遵守单一职责原则
class Vehicle{
    public void runroad(String vehicle){
        System.out.println(vehicle + "is running on the road");
    }

    public void runwater(String vehicle){
        System.out.println(vehicle + "is running on the water");
    }

    public void runair(String vehicle){
        System.out.println(vehicle + "is running on the air");
    }
}