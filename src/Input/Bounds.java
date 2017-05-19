package Input;

public class Bounds extends InputRepeater implements Checker{
    private static final String message = "Введите интервал A и B: ";
    private int leftBound;
    private int rightBound;

    public Bounds() {
        super(message);
    }

    public void setLeftBound(int leftBound) {
        this.leftBound = leftBound;
    }

    public void setRightBound(int rightBound) {
        this.rightBound = rightBound;
    }

    public int getLeftBound() {
        return leftBound;
    }

    public int getRightBound() {
        return rightBound;
    }
}
