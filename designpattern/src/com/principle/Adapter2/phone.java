package com.principle.Adapter2;

public class phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("5V,ok");
        }else if(iVoltage5V.output5V()>5){
            System.out.println("not 5V,no");
        }
    }
}
