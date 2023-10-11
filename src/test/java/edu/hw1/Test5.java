package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test5 {
    @Test
    void basicTest() {
        int number = 123312;
        boolean isPalindrome = Task5.isPalindromeDescendant(number);
        assertThat(isPalindrome)
            .isEqualTo(true);
    }

    @Test
    void palindrome() {
        int number = 12121;
        boolean isPalindrome = Task5.isPalindromeDescendant(number);
        assertThat(isPalindrome)
            .isEqualTo(true);
    }

    @Test
    void notPalindrome() {
        int number = 1234;
        boolean isPalindrome = Task5.isPalindromeDescendant(number);
        assertThat(isPalindrome)
            .isEqualTo(false);
    }

    @Test
    void notEven() {
        int number = 14345;
        boolean isPalindrome = Task5.isPalindromeDescendant(number);
        assertThat(isPalindrome)
            .isEqualTo(false);
    }

    @Test
    void sumMoreThanTen() {
        int number = 66101101;
        boolean isPalindrome = Task5.isPalindromeDescendant(number);
        assertThat(isPalindrome)
            .isEqualTo(true);
    }
}
