package Func;

import java.util.ArrayList;
import java.util.List;

public class CalcArgAndValue {
    public List<Double> arg;
    public List<Double> value;
    Rules rules;
    Function function;

    public CalcArgAndValue(Rules rules, Function function) {
        this.rules = rules;
        this.function = function;
        arg = new ArrayList<>();
        value = new ArrayList<>();
    }

    public void calcArgAndValue() {
        int leftBorder = rules.getLeftBorder();
        int rightBorder = rules.getRightBorder();
        double step = rules.getStep();
        for (double x = leftBorder ; x <= rightBorder; x+=step) {
            setArgValue(x);
        }
    }

    public void setArgValue(double x) {
        for (Part part : function.getParts()) {
            if (x >= part.getLeftBorder() && x < part.getRightBorder()) {
                arg.add(x);
                value.add(part.calcValue(x));
            }
        }
    }

}
