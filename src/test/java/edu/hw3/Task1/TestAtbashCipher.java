package edu.hw3.Task1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestAtbashCipher {
    @Test
    void basicTest() {
        String string = "hello";
        String result = AtbashCipher.atbash(string);
        assertThat(result).isEqualTo("svool");
    }

    @Test
    void upperCase() {
        String string = "ZeBrA";
        String result = AtbashCipher.atbash(string);
        assertThat(result).isEqualTo("AvYiZ");
    }

    @Test
    void notLatin() {
        String string = "hi - привет";
        String result = AtbashCipher.atbash(string);
        assertThat(result).isEqualTo("sr - привет");
    }
}
