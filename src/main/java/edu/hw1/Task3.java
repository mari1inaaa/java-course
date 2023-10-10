package edu.hw1;

public class Task3 {
    private Task3() {
    }

    public static boolean isNestable(int[] array1, int[] array2) {
        try {
            int max1 = array1[0];
            int min1 = array1[0];
            for (int i = 0; i < array1.length; i++) {
                max1 = Math.max(array1[i], max1);
                min1 = Math.min(array1[i], min1);
            }
            int max2 = array2[0];
            int min2 = array2[0];
            for (int i = 0; i < array2.length; i++) {
                max2 = Math.max(array2[i], max2);
                min2 = Math.min(array2[i], min2);
            }
            return min1 > min2 && max1 < max2;
        } catch (NullPointerException e) {
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
}
