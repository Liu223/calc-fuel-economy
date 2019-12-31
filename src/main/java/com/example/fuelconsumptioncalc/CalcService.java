package com.example.fuelconsumptioncalc;

public class CalcService {

    public int calc(int kyuyuRyo, int tripMeterChi) {
        int nenpi = tripMeterChi / kyuyuRyo;
        return nenpi;
    }
}