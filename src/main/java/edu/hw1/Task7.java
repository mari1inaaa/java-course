package edu.hw1;

public class Task7 {
    private Task7() {

    }

    public static char[] intToArrBin(int n) {
        String bin = Integer.toBinaryString(n);
        return bin.toCharArray();
    }

    public static int arrToBit(char[] array) {
        StringBuilder sb = new StringBuilder();
        for (char digit : array) {
            sb.append(digit);
        }
        String binString = sb.toString();
        return Integer.parseInt(binString, 2);
    }

    public static int rotateLeft(int n, int shift) {
        char[] array = intToArrBin(n);
        char[] rotatedArr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            int index = (i + shift) % array.length;
            if (array.length > index) {
                rotatedArr[i] = array[index];
            } else {
                rotatedArr[i] = array[Math.abs(array.length - index)];
            }
        }
        return arrToBit(rotatedArr);
    }

    public static int rotateRight(int n, int shift) {
        char[] array = intToArrBin(n);
        char[] rotatedArr = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            int index = (i - shift) % array.length;
            if (index >= 0) {
                rotatedArr[i] = array[index];
            } else {
                rotatedArr[i] = array[array.length + index];
            }
        }
        return arrToBit(rotatedArr);
    }
}
