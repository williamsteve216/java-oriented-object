package com.inheritance;

public class Car extends Vehicle {
    int numberOfSeats;
    double engineCapacity;

    public Car(String lisensePlate, String brand, double pricePerDay, int numberOfSeats, double engineCapacity) {
        super(lisensePlate, brand, pricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public double calculateRentalCost() {
        return this.pricePerDay * this.numberOfSeats;
    }
}
