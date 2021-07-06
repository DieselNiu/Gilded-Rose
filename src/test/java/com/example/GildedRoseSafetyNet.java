package com.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseSafetyNet {
    @Test
    public void should_always_align_with_baseline() throws IOException {
        String output = TextTestFixture.getBaseline();
        String baseline = new String(Files.readAllBytes(Paths.get("src/test/baseline.txt")));
        assertThat(output).isEqualTo(baseline);
    }
}
