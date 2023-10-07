package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test4 {
    @Test
    void evenLength() {
        String str = "оПомигет";
        String correctString = Task4.fixString(str);
        assertThat(correctString)
            .isEqualTo("Помогите");

    }

    @Test
    void unevenLength() {
        String str = "12345";
        String correctString = Task4.fixString(str);
        assertThat(correctString)
            .isEqualTo("21435");
    }
}
