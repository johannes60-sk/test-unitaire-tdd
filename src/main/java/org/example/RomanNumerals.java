package org.example;

public class RomanNumerals {
    private static final String[] ROMAN_NUMERALS = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
    private static final int[] VALUES = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    public static String convertToRoman(int number) {
        validateNumber(number);
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            number = appendRomanNumerals(number, roman, VALUES[i], ROMAN_NUMERALS[i]);
        }
        return roman.toString();
    }

    private static void validateNumber(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("Le nombre doit être entre 1 et 3000");
        }
    }

    private static int appendRomanNumerals(int number, StringBuilder roman, int value, String romanNumeral) {
        while (number >= value) {
            number -= value;
            roman.append(romanNumeral);
        }
        return number;
    }
}
