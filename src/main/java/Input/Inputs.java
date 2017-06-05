package Input;

import java.io.IOException;

public class Inputs {
    FunctionInput functionInput;
    RulesInput rulesInput;

    public Inputs(FunctionInput functionInput, RulesInput rulesInput) {
        this.functionInput = functionInput;
        this.rulesInput = rulesInput;
    }

    public void inputs() {
        try {
            functionInput.inputFunction();
            rulesInput.inputRules();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
