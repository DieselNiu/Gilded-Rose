package com.example.iterms;

import com.example.Item;

public class BackstagePasses extends Item {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected boolean isBackstage() {
        return true;
    }

    @Override
    protected void updateQualityAfterExpired() {
        quality = 0;
    }

    @Override
    protected void updateQuality() {
        increaseQuality();

        if (sellIn < 11) {
            increaseQuality();
        }

        if (sellIn < 6) {
            increaseQuality();
        }
    }

}
