package com.cabinvoiceservice;

public class InvoiceGenerator {

    private double MinCostPerKm = 10;
    private int CostPerTime = 1;

    public double calculateFare(double distance, int time) {
        return distance * MinCostPerKm + time * CostPerTime;
    }
}