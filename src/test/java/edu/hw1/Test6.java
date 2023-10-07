package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test6 {
    @Test
    void basicTest() {
        int number = 6621;
        int k = Task6.countK(number);
        assertThat(k)
            .isEqualTo(5);
    }
}
