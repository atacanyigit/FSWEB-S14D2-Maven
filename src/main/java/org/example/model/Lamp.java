package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    // 1. DÜZELTME: Değişken ismini testin aradığı isimle (globRating) eşle
    private LampType style;
    private boolean battery;
    private int globRating;

    // 2. DÜZELTME: Constructor parametre sırasını testin gönderdiğiyle eşle
    // Test: new Lamp(LampType.NORMAL, true, 80) şeklinde çağırıyor.
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

    // Test metodu bu isimle çağırdığı için getter ismini koruyoruz
    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style=" + style +
                ", battery=" + battery +
                ", globRating=" + globRating +
                '}';
    }
}