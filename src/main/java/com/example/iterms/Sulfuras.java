package com.example.iterms;

import com.example.Item;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    protected boolean isSulfuras() {
        return true;
    }

    @Override
    protected void updateSellInDays() {
    }

    @Override
    protected void updateQualityAfterExpired() {
    }

    @Override
    protected void updateQuality() {

    }
}

