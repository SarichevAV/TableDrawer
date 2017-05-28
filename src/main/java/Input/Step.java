package Input;

public class Step extends InputRepeater {
    private static final String message = "Введите шаг: ";
    private int step;

    public Step() {
        super(message);
    }

    public int getStep() {
        return step;
    }
}
