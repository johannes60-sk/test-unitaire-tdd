import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.RomanNumerals;
import org.junit.jupiter.api.Test;


public class RomanNumeralsTest {

    @Test
    public void testConvert1ToI() {
        assertEquals("I", RomanNumerals.convertToRoman(1));
    }

    @Test
    public void testConvert2ToII() {
        assertEquals("II", RomanNumerals.convertToRoman(2));
    }

    @Test
    public void testConvert3ToIII() {
        assertEquals("III", RomanNumerals.convertToRoman(3));
    }

    @Test
    public void testConvert4ToIV() {
        assertEquals("IV", RomanNumerals.convertToRoman(4));
    }

    @Test
    public void testConvert10ToX() {
        assertEquals("X", RomanNumerals.convertToRoman(10));
    }

    @Test
    public void testConvert40ToXL() {
        assertEquals("XL", RomanNumerals.convertToRoman(40));
    }

    @Test
    public void testConvert50ToL() {
        assertEquals("L", RomanNumerals.convertToRoman(50));
    }

    @Test
    public void testConvert90ToXC() {
        assertEquals("XC", RomanNumerals.convertToRoman(90));
    }

    @Test
    public void testConvert100ToC() {
        assertEquals("C", RomanNumerals.convertToRoman(100));
    }


    @Test
    public void testConvert400ToCD() {
        assertEquals("CD", RomanNumerals.convertToRoman(400));
    }

    @Test
    public void testConvert500ToD() {
        assertEquals("D", RomanNumerals.convertToRoman(500));
    }

    @Test
    public void testConvert900ToCM() {
        assertEquals("CM", RomanNumerals.convertToRoman(900));
    }

    @Test
    public void testConvert1000ToM() {
        assertEquals("M", RomanNumerals.convertToRoman(1000));
    }

    @Test
    public void testConvert1987ToMCMLXXXVII() {
        assertEquals("MCMLXXXVII", RomanNumerals.convertToRoman(1987));
    }

    @Test
    public void testConvert2024ToMMXXIV() {
        assertEquals("MMXXIV", RomanNumerals.convertToRoman(2024));
    }

    @Test
    public void testInvalidInputZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            RomanNumerals.convertToRoman(0);
        });
        assertEquals("Le nombre doit être entre 1 et 3000", thrown.getMessage());
    }

}