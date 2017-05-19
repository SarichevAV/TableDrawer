public class Part4 extends Part {
    private int leftBoard;
    private int rightBoard;

    public Part4(int leftBoard, int rightBoard) {
        this.leftBoard = leftBoard;
        this.rightBoard = rightBoard;
    }

    @Override
    public double calculateY(double x) {
        double y;
        y = 4 - x * x;
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
