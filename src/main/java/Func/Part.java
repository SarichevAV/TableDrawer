package Func;

import parsii.eval.Expression;
import parsii.eval.Parser;
import parsii.eval.Scope;
import parsii.eval.Variable;
import parsii.tokenizer.ParseException;

public class Part {
    private Double leftBorder;
    private Double rightBorder;
    private String formul;

    public Part(Double leftBorder, Double rightBorder, String formul) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.formul = formul;
    }

    public double calcValue(double arg) {
        Scope scope = Scope.create();
        Variable x = scope.getVariable("x");
        Expression expr = null;
        try {
            expr = Parser.parse(formul, scope);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        x.setValue(arg);
        return expr.evaluate();
    }

    public Double getLeftBorder() {
        return leftBorder;
    }

    public Double getRightBorder() {
        return rightBorder;
    }
}
