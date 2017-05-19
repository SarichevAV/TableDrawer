public class Part5 extends Part {
    private int leftBoard;
    private int rightBoard;

    public Part5(int leftBoard, int rightBoard) {
        this.leftBoard = leftBoard;
        this.rightBoard = rightBoard;
    }

    @Override
    public double calculateY(double x) {
        double y;
        y = -x + 2;
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
