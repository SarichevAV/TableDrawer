public class Part3 extends Part {
    private int leftBoard;
    private int rightBoard;

    @Override
    public double calculateY(double x) {
        double y;
        y = -Math.sqrt(4 - (x + 2) * (x + 2)) + 2;
        return y;
    }


    public Part3(int leftBoard, int rightBoard) {
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
