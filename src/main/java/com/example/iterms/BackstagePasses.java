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
        if (quality >= 50) {
            return;
        }
        quality = quality + 1;

        if (sellIn >= 11) {
            return;
        }
        if (quality < 50) {
            quality = quality + 1;
        }

        if (sellIn >= 6) {
            return;
        }
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
