package com.parc;

public class Camion extends Vehicle {
    private double capacity;

    public Camion(String marque, double capacity) {
        super(marque);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getDetails() {
        return "Camion de marque " + this.getMarque() + " avec une capacité de " + this.getCapacity() + " tonnes";
    }
}
