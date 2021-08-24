package com.cabinvoiceservice;

public class InvoiceService {

    private static final double MINFARE = 5;
    private static final double MINCOSTPERKM = 10;
    private static final int COSTPERTIME = 1;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINCOSTPERKM + time * COSTPERTIME;
        if(totalFare < MINFARE) {
            return MINFARE;
        }
        return totalFare;
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}