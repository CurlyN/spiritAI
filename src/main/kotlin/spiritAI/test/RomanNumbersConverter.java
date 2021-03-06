package spiritAI.test;


import java.util.Arrays;
import java.util.List;

public class RomanNumbersConverter {
    public final int[] ARAB_NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public final String[] ROMAN_NUMBERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public int convertFromRomanNumbers(String input) {
        for (int i = 0; i < ROMAN_NUMBERS.length; i++) {
            if (input.startsWith(ROMAN_NUMBERS[i]))
                return ARAB_NUMBERS[i] + convertFromRomanNumbers(input.replaceFirst(ROMAN_NUMBERS[i], ""));
        }
        return 0;
    }


    public String convertRomanExpression(String expression) {
        List<String> numbersList = Arrays.asList(ROMAN_NUMBERS);
        StringBuilder romanNumber = new StringBuilder();
        String arabExpression = expression;

        //if character is roman number, collect into word and then convert into Arabic format
        for (int i = 1; i <= expression.length(); i++) {
            if (numbersList.contains(expression.substring(i-1, i))) {
                romanNumber.append(expression, i-1, i);
            } else {
                //if character is not a roman number, check if we have words to convert
                if (romanNumber.length()!=0) {
                    String romanNumberString = romanNumber.toString();
                    arabExpression = arabExpression.replaceFirst(romanNumberString, String.valueOf(convertFromRomanNumbers(romanNumberString)));
                    romanNumber = new StringBuilder();
                }
            }
        }
        //convert the last word left
        String romanNumberString = romanNumber.toString();
        arabExpression = arabExpression.replaceFirst(romanNumberString, String.valueOf(convertFromRomanNumbers(romanNumberString)));

        return arabExpression;
    }


    public String convertArabNumbersToRoman(int number) {
        String romanNumber = "";
        for (int i = 0; i < ARAB_NUMBERS.length; i++) {
            while (number >= ARAB_NUMBERS[i]) {
                romanNumber +=ROMAN_NUMBERS[i];
                number -=ARAB_NUMBERS[i];
            }
        }

        return  romanNumber;
    }
}
