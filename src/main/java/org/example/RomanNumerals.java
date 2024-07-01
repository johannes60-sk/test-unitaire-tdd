package org.example;

public class RomanNumerals {
    public static String convertToRoman(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("Le nombre doit être entre 1 et 3000");
        }

        StringBuilder roman = new StringBuilder();

        String[] romanNumerals = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] values = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman.append(romanNumerals[i]);
            }
        }

        return roman.toString();
    }
}
