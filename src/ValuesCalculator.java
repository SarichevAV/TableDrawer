import Input.Step;

import java.util.*;

public class ValuesCalculator {// reutrns array of keys and values to table
    private List<Double> values = new ArrayList<>();
    private List<Double> calculatedValues = new ArrayList<>();
    private List<Part> parts = new ArrayList<>();
    Function function;
    double step;

    public ValuesCalculator(Function function, Step step) {// TODO: поступает из классов ввода!!!
        this.function = function;
        this.parts = function.parts;
        this.step = step.getStep();
    }

    List setValuesInList() {
        int listIndex = 0;
        for (double i = function.getLeftBoard(); i < function.getRightBoard(); i = i + step,  listIndex++) {
            values.set(listIndex, i);
        }
        return values;
    }

    List valuesCalculator() {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) >= parts.get(0).getLeftBoard() & values.get(i) < parts.get(0).getRightBoard()) {
                calculatedValues.set(i, parts.get(0).calculateY(values.get(0)));//TODO
            }
        }

        return calculatedValues;
    }
}
