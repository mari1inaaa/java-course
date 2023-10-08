package edu.hw1;

import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    private Task6() {

    }

    public static int arrToNum(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int digit : arr) {
            sb.append(digit);
        }
        String numberString = sb.toString();
        return Integer.parseInt(numberString);
    }

    private static int count = 1;

    public static int countK(int number) {
        final int NUM_L = 4;
        Integer[] increasingArr = new Integer[NUM_L];
        Integer[] decreasingArr = new Integer[NUM_L];
        final int TEN = 10;
        int numToDiv = number;
        for (int i = 0; i < NUM_L; i++) {
            increasingArr[i] = numToDiv % TEN;
            numToDiv /= TEN;
        }
        System.arraycopy(increasingArr, 0, decreasingArr, 0, NUM_L);
        Arrays.sort(increasingArr);
        Arrays.sort(decreasingArr, Collections.reverseOrder());
        int increasingNum = arrToNum(increasingArr);
        int decreasingNum = arrToNum(decreasingArr);
        int difference = decreasingNum - increasingNum;
        final int KAP = 6174;
        if (difference != KAP) {
            count++;
            return countK(difference);
        } else {
            return count;
        }
    }
}
