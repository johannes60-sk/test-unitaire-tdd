import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void testConvert1ToI() {
        assertEquals("I", RomanNumerals.toRoman(1));
    }
}