package spiritAI.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RomanCalculator {

    public String calculateRomanNumbers(String expression) throws ScriptException {
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();
        //Perform conversion into Arabic style
        String expressionToEvaluate = romanNumbersConverter.convertRomanExpression(expression);

        //Use predefined JS evaluation function in order to evaluate expression
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        int result = (int) engine.eval(expressionToEvaluate);
        //convert result into roman
        return romanNumbersConverter.convertArabNumbersToRoman(result);
    }
}
