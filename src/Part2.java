public class Part2 extends Part {// TODO: Переделать части как объекты одного класса
    private int leftBoard;
    private int rightBoard;

    public Part2(int leftBoard, int rightBoard) {
        this.leftBoard = leftBoard;
        this.rightBoard = rightBoard;
    }

    @Override
    public double calculateY(double x) {
        double y;
        y = 0.25 * x + 0.5;
        return y;
    }

    @Override
    public int getLeftBoard() {
        return leftBoard;
    }

    @Override
    public int getRightBoard() {
        return rightBoard;
    }
}
