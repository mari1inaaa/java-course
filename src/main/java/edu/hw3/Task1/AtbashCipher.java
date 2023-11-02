package edu.hw3.Task1;

import java.util.ArrayList;

public class AtbashCipher {
    private AtbashCipher() {

    }

    public static final char[] ALPHABET_LOW = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char[] ALPHABET_HIGH = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
        'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final int LENGTH = 26;

    public static String atbash(String string) {
        ArrayList<String> encoding = new ArrayList<String>();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char symbol = charArray[i];
            boolean isLatinLetter = false;
            for (int j = 0; j < ALPHABET_LOW.length; j++) {
                if (symbol == ALPHABET_LOW[j]) {
                    isLatinLetter = true;
                    encoding.add(String.valueOf(ALPHABET_LOW[LENGTH - 1 - j]));
                } else if (symbol == ALPHABET_HIGH[j]) {
                    isLatinLetter = true;
                    encoding.add(String.valueOf(ALPHABET_HIGH[LENGTH - 1 - j]));
                }
                if (!isLatinLetter & j == ALPHABET_LOW.length - 1) {
                    encoding.add(String.valueOf(symbol));
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String el : encoding) {
            stringBuilder.append(el);
        }
        return stringBuilder.toString();
    }
}
