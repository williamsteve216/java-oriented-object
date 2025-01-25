package com.inheritance;

public class Reservation {
    public String customerName;
    public Vehicle vehicle;
    public int rentalDuration;

    public Reservation(String customerName, Vehicle vehicle, int rentalDuration) {
        this.customerName = customerName;
        this.vehicle = vehicle;
        this.rentalDuration = rentalDuration;
    }
}
