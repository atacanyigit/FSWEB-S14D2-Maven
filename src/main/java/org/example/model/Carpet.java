package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    // Testlerin beklentisine göre sıralama: width, height, color
    // Not: Eğer test "int cannot be converted to PaintColor" diyorsa,
    // test içindeki 'new Carpet(3, 5, PaintColor.RED)' kullanımıyla bu constructor eşleşmelidir.
    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void lying() {
        System.out.println("Carpet is lying on bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "color=" + color +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}