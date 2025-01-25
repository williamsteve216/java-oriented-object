package com.test.transport;

public sealed abstract class Vehicule permits Car, Truck {
    public abstract String getType();
}