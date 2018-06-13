package spiritAI.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RomanCalculator {

    public String calculateRomanNumbers(String expression){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();
        //Perform conversion into Arabic style
        String expressionToEvaluate = romanNumbersConverter.convertRomanExpression(expression);

        //Use predefined JS evaluation function in order to evaluate expression
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        int result;

        try {
            result = (int) engine.eval(expressionToEvaluate);
        }catch(ScriptException e) {
            return "Please, enter correct expression";
        }

        //convert result into roman
        return romanNumbersConverter.convertArabNumbersToRoman(result);
    }
}
