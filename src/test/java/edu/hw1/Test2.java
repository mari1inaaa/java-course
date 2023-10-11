package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test2 {
    @Test
    void count() {
        int number = 4567;
        int count = Task2.countDigits(number);
        assertThat(count)
            .isEqualTo(4);
    }

    @Test
    void zero() {
        int number = 0;
        int count = Task2.countDigits(number);
        assertThat(count)
            .isEqualTo(1);
    }
}
