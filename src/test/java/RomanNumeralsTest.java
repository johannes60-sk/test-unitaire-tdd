import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.RomanNumerals;
import org.junit.jupiter.api.Test;


public class RomanNumeralsTest {

    @Test
    public void testConvert1ToI() {
        assertEquals("I", RomanNumerals.convertToRoman(1));
        assertEquals("II", RomanNumerals.convertToRoman(2));

    }
}