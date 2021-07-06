package com.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TextTestFixture {
    public static void main(String[] args) {
//        PrintStream printStream = System.out;
        String baseline = getBaseline();
        System.out.println(baseline);
    }

     static String getBaseline() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");

        Item[] items = new Item[]{
            Item.createNormalItem("+5 Dexterity Vest", 10, 20), //
            Item.createAgedBrie( 2, 0), //
            Item.createNormalItem("Elixir of the Mongoose", 5, 7), //
            Item.createSulfuras( 0, 80), //
            Item.createSulfuras( -1, 80),
           Item.createBackStagePass( 15, 20),
            Item.createBackStagePass( 10, 49),
            Item.createBackStagePass( 5, 49),
            // this conjured item does not work properly yet
            Item.createNormalItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 2;

        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.passOneDay();
        }
        String baseline = out.toString();
        return baseline;
    }


}
