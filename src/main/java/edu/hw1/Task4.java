package edu.hw1;

public class Task4 {
    private Task4() {

    }

    public static String fixString(String str) {
        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < (chars.length % 2 == 0 ? chars.length : (chars.length - 1)); i += 2) {
            newChars[i] = chars[i + 1];
            newChars[i + 1] = chars[i];
        }
        if (chars.length % 2 != 0) {
            newChars[chars.length - 1] = chars[chars.length - 1];
        }
        return String.valueOf(newChars);
    }
}
