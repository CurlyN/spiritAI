package spiritAI.test;

import org.junit.Test;

import javax.script.ScriptException;

import static org.junit.Assert.assertEquals;

public class RomanCalculatorTests {

    @Test
    public void convertRomanNumbersToArab() {
        RomanNumbersConverter converter = new RomanNumbersConverter();

        assertEquals(29, converter.convertFromRomanNumbers("XXIX"));
        assertEquals(2018, converter.convertFromRomanNumbers("MMXVIII"));
        assertEquals(1009, converter.convertFromRomanNumbers("MIX"));
    }

    @Test
    public void recognizeAndConvertRomanNumbersInExpression() {
        RomanNumbersConverter converter = new RomanNumbersConverter();

        assertEquals("9+10", converter.convertRomanExpression("IX+X"));
        assertEquals("1009-1000", converter.convertRomanExpression("MIX-M"));
        assertEquals("7/10", converter.convertRomanExpression("VII/X"));
    }

    @Test
    public void convertArabNumbersToRoman() {
        RomanNumbersConverter converter = new RomanNumbersConverter();

        assertEquals("IX", converter.convertArabNumbersToRoman(9));
        assertEquals("MMXVIII", converter.convertArabNumbersToRoman(2018));
        assertEquals("CVI", converter.convertArabNumbersToRoman(106));
    }


    @Test
    public void calculateRomanExpression() throws ScriptException {
        RomanCalculator calculator = new RomanCalculator();

        assertEquals("III", calculator.calculateRomanNumbers("(VIII+X)/VI"));
        assertEquals("V", calculator.calculateRomanNumbers("XXV/V"));
        assertEquals("X", calculator.calculateRomanNumbers("C/X"));
    }


}
