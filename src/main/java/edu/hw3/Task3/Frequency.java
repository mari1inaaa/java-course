package edu.hw3.Task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency<T> {
    public Map<T, Integer> freqDict(List<T> list) {
        Map<T, Integer> dictionary = new HashMap<>();
        for (T element : list) {
            if (dictionary.containsKey(element)) {
                Integer value = dictionary.get(element);
                dictionary.put(element, value + 1);

            } else {
                dictionary.put(element, 1);
            }
        }
        return dictionary;
    }
}
