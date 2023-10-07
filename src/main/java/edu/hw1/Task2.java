package edu.hw1;

public class Task2 {
    private Task2() {

    }

    @SuppressWarnings("Magic Number")
    public static int countDigits(int numToCount) {
        final int TEN = 10;
        int count = 0;
        int numToDiv = numToCount;
        do {
            count++;
            numToDiv /= TEN;
        } while (numToDiv != 0);
        return count;
    }
}
