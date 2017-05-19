import java.util.ArrayList;
import java.util.List;

public class Function {
    private int rightBoard;
    private int leftBoard;
    List<Part> parts = new ArrayList<>();
    // TODO: Вычислить левую и пр границы с помощью сортировки в компараторе

    Function() {
        this.leftBoard = -7;
        this.rightBoard = 3;
        this.parts = partCreator();
    }

    public int getRightBoard() {
        return rightBoard;
    }

    public int getLeftBoard() {
        return leftBoard;
    }//of function

    private List<Part> partCreator(){
        parts.add(new Part1(-10, -6));// TODO
        parts.add(new Part2(-6, -2));
        parts.add(new Part3(-2, 0));
        parts.add(new Part4(0,2));
        parts.add(new Part5(2,10));
        return parts;
    }
}
