package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test7 {
    @Test
    void left() {
        int n = 27;
        int shift = 2;
        int rotated = Task7.rotateLeft(n, shift);
        assertThat(rotated)
            .isEqualTo(Integer.parseInt("01111", 2));
    }

    @Test
    void right() {
        int n = 17;
        int shift = 3;
        int rotated = Task7.rotateRight(n, shift);
        assertThat(rotated)
            .isEqualTo(Integer.parseInt("00110", 2));
    }

    @Test
    void maxValueRight() {
        int n = 42;
        int shift = Integer.MAX_VALUE;
        int rotated = Task7.rotateRight(n, shift);
        assertThat(rotated)
            .isEqualTo(Integer.parseInt("010101", 2));
    }

    @Test
    void maxValueLeft () {
        int n = Integer.MAX_VALUE;
        int shift = 21;
        int rotated = Task7.rotateLeft(n, shift);
        assertThat(rotated)
            .isEqualTo(Integer.parseInt(Integer.toBinaryString(Integer.MAX_VALUE), 2));
    }
}
