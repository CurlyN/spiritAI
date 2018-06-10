package spiritAI.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RomanCalculator {

    public String calculateRomanNumbers(String expression) throws ScriptException {
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();
        String expressionToEvaluate = romanNumbersConverter.convertRomanExpression(expression);

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        return engine.eval(expressionToEvaluate).toString();
    }
}
