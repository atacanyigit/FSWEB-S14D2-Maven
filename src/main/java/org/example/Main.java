package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(LampType.NEON, true, 100);
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        Bed bed = new Bed("Double", 2, 2, 1, 1);
        Wardrobe wardrobe = new Wardrobe(2, 40, 40);
        Carpet carpet = new Carpet(3, 5, PaintColor.RED);

        Bedroom bedroom = new Bedroom(bed, carpet, ceiling, lamp, "Yiğit'in Odası",
                wall1, wall2, wall3, wall4, wardrobe);

        System.out.println("Bedroom created: " + bedroom.getName());
    }
}