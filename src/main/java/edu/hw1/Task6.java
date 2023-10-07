package edu.hw1;

import java.util.Collections;
import java.util.Arrays;

public class Task6 {
    private Task6() {

    }

    public static int arrToNum(Integer[] arr){
        StringBuilder sb = new StringBuilder();
        for (int digit : arr) {
            sb.append(digit);
        }
        String numberString = sb.toString();
        return Integer.parseInt(numberString);
    }

    private static int count = 1;
    @SuppressWarnings("Magic Number")
    public static int countK(int number) {
        Integer[] increasingArr = new Integer[4];
        Integer[] decreasingArr = new Integer[4];
        for (int i = 0; i < 4; i++) {
            increasingArr[i] = number % 10;
            number /= 10;
        }
        System.arraycopy(increasingArr, 0, decreasingArr, 0, 4);
        Arrays.sort(increasingArr);
        Arrays.sort(decreasingArr, Collections.reverseOrder());
        int increasingNum = arrToNum(increasingArr);
        int decreasingNum = arrToNum(decreasingArr);
        int difference = decreasingNum - increasingNum;
        if (difference != 6174) {
            count++;
            return countK(difference);
        } else {
            return count;
        }
    }
}
