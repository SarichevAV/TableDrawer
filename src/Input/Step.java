package Input;

import InputUser.InputRepeater;

public class Step extends InputRepeater {
    private static final String message = "Введите шаг: ";
    private int step;

    public Step() {
        super(message);
    }

    public void setStep(int step) {
        this.step = step;
    }
    public int getStep() {
        return step;
    }
}
