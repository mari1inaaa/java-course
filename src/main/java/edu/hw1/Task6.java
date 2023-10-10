package edu.hw1;

import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    private Task6() {

    }

    private static int arrToNum(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int digit : arr) {
            sb.append(digit);
        }
        String numberString = sb.toString();
        return Integer.parseInt(numberString);
    }

    static final int NUM_L = 4;
    static final int TEN = 10;
    static final int KAP = 6174;

    public static int countK(int number, int count) {
        int copyCount = count;
        Integer[] increasingArr = new Integer[NUM_L];
        Integer[] decreasingArr = new Integer[NUM_L];

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

        if (difference != KAP) {
            copyCount++;
            return countK(difference, copyCount);
        } else {
            return copyCount;
        }
    }
}
