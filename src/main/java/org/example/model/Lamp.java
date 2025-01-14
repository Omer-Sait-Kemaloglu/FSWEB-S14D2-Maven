package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style; // Access modifier: private
    private boolean battery; // Access modifier: private
    private int globRating; // Access modifier: private

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
