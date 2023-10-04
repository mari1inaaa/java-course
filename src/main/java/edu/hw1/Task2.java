package edu.hw1;

public class Task2 {
    public static int countDigits(int number) {
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }
}
