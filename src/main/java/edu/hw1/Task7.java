package edu.hw1;

public class Task7 {
    private Task7() {

    }

    public static int[] intToArrBin(int n) {
        String bin = Integer.toBinaryString(n);
        int[] arr = new int[bin.length()];
        for (int i = 0; i < bin.length(); i++) {
            arr[i] = Character.getNumericValue(bin.charAt(i));
        }
        return arr;
    }

    public static int arrToBit(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int digit : arr) {
            sb.append(digit);
        }
        String binString = sb.toString();
        return Integer.parseInt(binString, 2);
    }

    public static int rotateLeft(int n, int shift) {
        int[] arr = intToArrBin(n);
        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr.length > i + shift) {
                rotatedArr[i] = arr[i + shift];
            } else {
                rotatedArr[i] = arr[Math.abs(arr.length - i - shift)];
            }
        }
        return arrToBit(rotatedArr);
    }

    public static int rotateRight(int n, int shift) {
        int[] arr = intToArrBin(n);
        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i - shift >= 0) {
                rotatedArr[i] = arr[i - shift];
            } else {
                rotatedArr[i] = arr[arr.length + i - shift];
            }
        }
        return arrToBit(rotatedArr);
    }
}
