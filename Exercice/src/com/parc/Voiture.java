package com.parc;

public class Voiture extends Vehicle {
    private int nbrePortes;

    public Voiture(String marque, int nbrePortes) {
        super(marque);
        this.nbrePortes = nbrePortes;
    }

    public int getNbrePortes() {
        return this.nbrePortes;
    }

    public void setNbrePortes(int nbrePortes) {
        this.nbrePortes = nbrePortes;
    }

    @Override
    public String getDetails() {
        return "Voiture de marque " + this.getMarque() + " avec " + this.getNbrePortes() + " portes";
    }
}
