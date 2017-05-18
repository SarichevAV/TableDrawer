package Input;

public class Bounds extends InputRepeater{
    private static final String message = "Введите интервал A и B: ";
    private int leftBorder;
    private int rightBorder;

    public Bounds() {
        super(message);
    }

    public void setLeftBorder(int leftBorder) {
        this.leftBorder = leftBorder;
    }

    public void setRightBorder(int rightBorder) {
        this.rightBorder = rightBorder;
    }

    public int getLeftBorder() {
        return leftBorder;
    }

    public int getRightBorder() {
        return rightBorder;
    }
}
