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
}