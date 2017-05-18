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

    List<Part> partCreator(){
        parts.add(new Part(" ", ...,...));
        parts.add(new Part(" ", ...,...));
        parts.add(new Part(" ", ...,...));
        parts.add(new Part(" ", ...,...));
        parts.add(new Part(" ", ...,...));
        return parts;
    }
}
