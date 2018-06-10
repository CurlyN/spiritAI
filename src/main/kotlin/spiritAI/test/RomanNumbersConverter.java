package spiritAI.test;


public class RomanNumbersConverter {
    public final int[] ARAB_NUMBERS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    public final String[] ROMAN_NUMBERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };


    public int convertFromRomanNumbers(String input) {
        for (int i =0; i < ROMAN_NUMBERS.length; i++) {
            if(input.startsWith(ROMAN_NUMBERS[i]))
                return ARAB_NUMBERS[i] + convertFromRomanNumbers(input.replaceFirst(ROMAN_NUMBERS[i], ""));
        }
        return 0;
    }


}
