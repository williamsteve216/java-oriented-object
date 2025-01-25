package com.inheritance;

public abstract class Vehicle {
    String lisensePlate;
    String brand;
    double pricePerDay;

    public Vehicle(String lisensePlate, String brand, double pricePerDay) {
        this.lisensePlate = lisensePlate;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
    }

    public abstract double calculateRentalCost();
}
