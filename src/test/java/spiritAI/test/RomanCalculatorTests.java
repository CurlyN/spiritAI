package spiritAI.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTests {
    @Test
    public void convertRomanNumbersToArab() {
        RomanNumbersConverter converter = new RomanNumbersConverter();

        assertEquals(29, converter.convertFromRomanNumbers("XXIX"));
        assertEquals(2018, converter.convertFromRomanNumbers("MMXVIII"));
        assertEquals(1009, converter.convertFromRomanNumbers("MIX"));
    }




}
