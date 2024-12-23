package com.mycompany.instrom.Percussion;

import com.mycompany.instrom.MusicalInstrument;

public class Percussion extends MusicalInstrument {
    private final String material;
    private final String size;
    private final String tone;
    
    public Percussion(String name, String brand, String id, String description, String image, String warrantyPeriod, double price, boolean available, int quantity, String material, String size, String tone) {
        super(name, brand, id, description, image, InstrumentCategory.PERCUSSION, warrantyPeriod, price, available, quantity);
        this.material = material;
        this.size = size;
        this.tone = tone;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }

    public String getTone() {
        return tone;
    }
}
