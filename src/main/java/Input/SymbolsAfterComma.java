package Input;

public class SymbolsAfterComma extends InputRepeater {
    private static final String message = "Введите количество символов после запятой: ";
    private int symbolsAfrreComma;

    public SymbolsAfterComma() {
        super(message);
    }

    public void setStep(int step) {
        this.symbolsAfrreComma = step;
    }

    public int getStep() {
        return symbolsAfrreComma;
    }
}
