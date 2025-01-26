package com.parc;

public class Vehicle {
    static int nbVehicles = 0;
    private String marque;

    public Vehicle(String marque) {
        this.marque = marque;
        nbVehicles++;
    }

    public String getDetails() {
        return "Marque : " + marque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public static int getNbreVehicles() {
        return Vehicle.nbVehicles;
    }

}
