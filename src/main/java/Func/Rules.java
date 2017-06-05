package Func;

public class Rules {
    private int leftBorder;
    private int rightBorder;
    private double step;

    public Rules(int leftBorder, int rightBorder, double step) {
        this.leftBorder = leftBorder;
        this.rightBorder = rightBorder;
        this.step = step;
    }

    public Rules() {
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public int getRightBorder() {
        return rightBorder;
    }

    public double getStep() {
        return step;
    }

    public void setLeftBorder(int leftBorder) {
        this.leftBorder = leftBorder;
    }

    public void setRightBorder(int rightBorder) {
        this.rightBorder = rightBorder;
    }

    public void setStep(double step) {
        this.step = step;
    }
}
