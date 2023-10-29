package edu.hw3.Task4;

public class Roman {
    private Roman() {

    }

    public static final int MAX_VALUE = 3999;
    public static final int MIN_VALUE = 1;
    public static final int TEN = 10;
    public static final int HUNDRED = 100;
    public static final int THOUSAND = 1000;

    public static String convertToRoman(int arab) {
        if (arab < MIN_VALUE || arab > MAX_VALUE) {
            throw new IllegalArgumentException("Число должно быть в диапазоне от 1 до 3999");
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] digits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[arab / THOUSAND]
            + hundreds[(arab % THOUSAND) / HUNDRED]
            + tens[(arab % HUNDRED) / TEN]
            + digits[arab % TEN];
    }
}
