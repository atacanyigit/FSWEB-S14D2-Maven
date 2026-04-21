package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    // HATA ÇÖZÜMÜ: Parametre sırasını (int, PaintColor) olarak değiştiriyoruz.
    // Çünkü test dosyası büyük ihtimalle 'new Ceiling(3, PaintColor.RED)' şeklinde çağırıyor.
    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void create() {
        System.out.println("Ceiling has been built.");
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "color=" + color +
                ", height=" + height +
                '}';
    }
}