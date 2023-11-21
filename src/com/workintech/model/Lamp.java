package com.workintech.model;

import enums.LampType;

public class Lamp {

    private LampType lampType;
    private boolean battery;
    private int globRating;

    public Lamp(LampType lampType, boolean battery, int globRating) {
        this.lampType = lampType;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getLampType() {
        return lampType;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
//        String message = "test";
//        message = globRating > 100 ? "test1" : "test2";
        System.out.println(String.format("Lamp is being turned on. %d", globRating));
        //ystem.out.println(String.format("Lamp is being turned on. %d", globRating));
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "lampType=" + lampType.name() +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}
