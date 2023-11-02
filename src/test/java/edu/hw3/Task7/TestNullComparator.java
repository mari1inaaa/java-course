package edu.hw3.Task7;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import java.util.TreeMap;

public class TestNullComparator {
    @Test
    void basicTest() {
        TreeMap<String, String> tree = new TreeMap<>(new NullComparator<>());
        tree.put(null, "test");

        assertThat(tree.containsKey(null)).isTrue();
    }
}
