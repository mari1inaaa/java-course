package edu.hw3.Task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBackwardIterator {
    @Test
    public void testBackwardIterator() {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        BackwardIterator<Integer> iterator = new BackwardIterator<>(data);

        List<Integer> reversedData = new ArrayList<>(data);
        reversedData.sort(Collections.reverseOrder());

        for (int value : reversedData) {
            assertTrue(iterator.hasNext());
            assertEquals(value, iterator.next());
        }

        assertFalse(iterator.hasNext());
    }

    @Test
    public void testEmptyCollection() {
        List<Integer> data = new ArrayList<>();
        BackwardIterator<Integer> iterator = new BackwardIterator<>(data);

        assertFalse(iterator.hasNext());
    }
}
