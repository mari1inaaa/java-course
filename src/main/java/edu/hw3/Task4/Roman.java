package edu.hw3.Task4;

public class Roman {
    private Roman() {

    }

    public static final int MAX_VALUE = 3999;
    public static final int MIN_VALUE = 1;
    public static final int TEN = 10;
    public static final int HUNDRED = 100;
    public static final int THOUSAND = 1000;
    public static final String[] THOUSANDS = {"", "M", "MM", "MMM"};
    public static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    public static final String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static final String[] DIGITS = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static String convertToRoman(int arab) {
        if (arab < MIN_VALUE || arab > MAX_VALUE) {
            throw new IllegalArgumentException("Число должно быть в диапазоне от 1 до 3999");
        }

        return THOUSANDS[arab / THOUSAND]
            + HUNDREDS[(arab % THOUSAND) / HUNDRED]
            + TENS[(arab % HUNDRED) / TEN]
            + DIGITS[arab % TEN];
    }
}
