package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test1 {
    @Test
    void simple() {
        String time = "15:59";
        int seconds = Task1.minutesToSeconds(time);
        assertThat(seconds)
            .isEqualTo(959);
    }

    @Test
    void moreThanSixty() {
        String time = "23:61";
        int seconds = Task1.minutesToSeconds(time);
        assertThat(seconds)
            .isEqualTo(-1);
    }

    @Test
    void incorrectFormat() {
        String time = "23:bb:1";
        int seconds = Task1.minutesToSeconds(time);
        assertThat(seconds)
            .isEqualTo(-1);
    }
}
