public class Part1 extends Part {
    private int leftBoard;
    private int rightBoard;

    @Override
    public double calculateY(double x) {
        double y;
        y = -2;
        return y;
    }

    public Part1(int leftBoard, int rightBoard) {
        this.leftBoard = leftBoard;
        this.rightBoard = rightBoard;
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
