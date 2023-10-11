package edu.hw1;

public class Task5 {
    private Task5() {

    }

    private static boolean isPalindrome(int[] digits) {
        for (int i = 0; i < (digits.length / 2); i++) {
            if (digits[i] != digits[digits.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] transformArray(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            for (char digit : String.valueOf(num).toCharArray()) {
                sb.append(digit);
            }
        }

        int[] transformedDigits = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            transformedDigits[i] = Character.getNumericValue(sb.charAt(i));
        }

        return transformedDigits;
    }

    private static int[] descendant(int[] digits) {
        int[] descendantDigits = new int[digits.length / 2];
        for (int i = 0, j = 0; i < digits.length / 2; i++, j++) {
            descendantDigits[i] = digits[i + j] + digits[i + 1 + j];
        }
        return descendantDigits;
    }

    public static boolean isPalindromeDescendant(int number) {
        String str = Integer.toString(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        while (digits.length > 1) {
            digits = transformArray(digits);
            if (isPalindrome(digits)) {
                return true;
            } else if (digits.length % 2 == 0) {
                digits = descendant(digits);
            } else {
                return false;
            }
        }
        return false;
    }
}
