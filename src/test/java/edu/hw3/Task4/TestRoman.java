package edu.hw3.Task4;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestRoman {
    @Test
    void correctInput() {
        int num = 567;
        String result = Roman.convertToRoman(num);
        assertThat(result).isEqualTo("DLXVII");
    }

    @Test
    void outOfRange() {
        int num = 4001;
        assertThrows(IllegalArgumentException.class, () -> {
            Roman.convertToRoman(num);
        });
    }
}
