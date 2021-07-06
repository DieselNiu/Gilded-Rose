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
        increaseQuality();
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }
}
