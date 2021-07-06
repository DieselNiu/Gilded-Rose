package com.example.iterms;

import com.example.Item;

public class BackstagePasses extends Item {
    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert",sellIn, quality);
    }

    @Override
    protected boolean isBackstage() {
        return true;
    }
}
