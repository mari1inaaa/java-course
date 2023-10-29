package edu.hw3.Task3;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class TestFrequency {
    @Test
    void basicTest() {
        List<String> strings = Arrays.asList("a", "bb", "a", "bb");
        Frequency<String> frequency = new Frequency<>();
        Map<String, Integer> map = frequency.freqDict(strings);
        assertThat(map).containsOnlyKeys("a", "bb");
        assertThat(map).containsValues(2, 2);
    }

    @Test
    void intType() {
        List<Integer> strings = Arrays.asList(1, 1, 2, 2, 2);
        Frequency<Integer> frequency = new Frequency<>();
        Map<Integer, Integer> map = frequency.freqDict(strings);
        assertThat(map).containsOnlyKeys(1, 2);
        assertThat(map).containsValues(2, 3);
    }
}
