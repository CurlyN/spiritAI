package spiritAI.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptException;

@RestController
public class RomanCalculatorController {

    private RomanCalculator romanCalculator = new RomanCalculator();

    @PostMapping("/calculate")
    public String calculator(@RequestBody Expression expression) throws ScriptException {

        return romanCalculator.calculateRomanNumbers(expression.getExpression());

    }

}

