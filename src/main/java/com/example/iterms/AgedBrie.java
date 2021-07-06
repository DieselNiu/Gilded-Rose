package com.example.iterms;

import com.example.Item;

public class AgedBrie extends Item {
    public AgedBrie( int sellIn, int quality) {
        super("Aged Brie",sellIn,quality);
    }

    @Override
    protected boolean isAgedBrie() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpired() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
