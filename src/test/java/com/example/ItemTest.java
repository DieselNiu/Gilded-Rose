package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ItemTest {
    @Test
    public void should_double_increase_backstage_pass_value_when_getting_close_to_expiration(){
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        item.passOneDay();
        assertThat(item.quality).isEqualTo(21);
        item.passOneDay();
        assertThat(item.quality).isEqualTo(23);
        

    }

}