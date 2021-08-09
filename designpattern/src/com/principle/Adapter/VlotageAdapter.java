package com.principle.Adapter;

public class VlotageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output220V() {
        return super.output220V();
    }

    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV/44;
        return dstV;
    }
}
