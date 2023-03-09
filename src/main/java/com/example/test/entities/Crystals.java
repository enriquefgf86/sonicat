package com.example.test.entities;

public class Crystals extends GenericAttributes {
    private int numberCrystals;
    private float meanSize;


    public Crystals() {
        // Constructor por defecto necesario para Jackson
    }

    public Crystals(int numberCrystals, float meanSize) {
        this.numberCrystals = numberCrystals;
        this.meanSize = meanSize;
    }

    public Crystals(String name, String type, String identifier, int numberCrystals, float meanSize) {
        super(name, type, identifier);
        this.numberCrystals = numberCrystals;
        this.meanSize = meanSize;
    }

    public int getNumberCrystals() {
        return numberCrystals;
    }

    public void setNumberCrystals(int numberCrystals) {
        this.numberCrystals = numberCrystals;
    }

    public float getMeanSize() {
        return meanSize;
    }

    public void setMeanSize(float meanSize) {
        this.meanSize = meanSize;
    }

    @Override
    public String toString() {
        return "Crystals{" +
                "numberCrystals=" + numberCrystals +
                ", meanSize=" + meanSize +
                '}';
    }
}
