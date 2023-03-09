package com.example.test.entities;

public class Yeast extends GenericAttributes {
    private int sampleWeight;
    private int numberYeasts;
    private float yeastsConcentration;

    public Yeast() {
    }

    public Yeast(int sampleWeight, int numberYeasts) {
        this.sampleWeight = sampleWeight;
        this.numberYeasts = numberYeasts;
        this.yeastsConcentration = (float) ((numberYeasts / 100) * 0.000091);
    }

    public Yeast(String name, String type, String identifier, int sampleWeight, int numberYeasts) {
        super(name, type, identifier);
        this.sampleWeight = sampleWeight;
        this.numberYeasts = numberYeasts;
        this.yeastsConcentration = (float) ((numberYeasts / 100) * 0.000091);
    }

    public int getSampleWeight() {
        return sampleWeight;
    }

    public void setSampleWeight(int sampleWeight) {
        this.sampleWeight = sampleWeight;
    }

    public int getNumberYeasts() {
        return numberYeasts;
    }

    public void setNumberYeasts(int numberYeasts) {
        this.numberYeasts = numberYeasts;
    }

    public float getYeastsConcentration() {
        return yeastsConcentration;
    }

    public void setYeastsConcentration(float yeastsConcentration) {
        this.yeastsConcentration = yeastsConcentration;
    }

    @Override
    public String toString() {
        return "Yeast{" +
                "sampleWeight=" + sampleWeight +
                ", numberYeasts=" + numberYeasts +
                ", yeastsConcentration=" + yeastsConcentration +
                '}';
    }
}
