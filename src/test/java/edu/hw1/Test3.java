package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test3 {
    @Test
    void minMoreMaxLess() {
        int[] arr1 = {1, 2, 8, 9};
        int[] arr2 = {0, 3, 10};
        boolean isNestable = Task3.isNestable(arr1, arr2);
        assertThat(isNestable)
            .isEqualTo(true);
    }
    @Test
    void minLessMaxLess() {
        int[] arr1 = {1, 2, 8, 9};
        int[] arr2 = {7, 3, 10};
        boolean isNestable = Task3.isNestable(arr1, arr2);
        assertThat(isNestable)
            .isEqualTo(false);
    }

    @Test
    void minMoreMaxMore() {
        int[] arr1 = {1, 2, 8, 9};
        int[] arr2 = {0, 3, 5, 1, 4};
        boolean isNestable = Task3.isNestable(arr1, arr2);
        assertThat(isNestable)
            .isEqualTo(false);
    }
    @Test
    void minLessMaxMore() {
        int[] arr1 = {1, 9};
        int[] arr2 = {8, 3, 8};
        boolean isNestable = Task3.isNestable(arr1, arr2);
        assertThat(isNestable)
            .isEqualTo(false);
    }
    @Test
    void equality() {
        int[] arr1 = {0, 2, 8, 9};
        int[] arr2 = {0, 3, 9};
        boolean isNestable = Task3.isNestable(arr1, arr2);
        assertThat(isNestable)
            .isEqualTo(false);
    }
}
