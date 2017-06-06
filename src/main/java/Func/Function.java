package Func;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private List<Part> part = new ArrayList<>();

    public Function(List<Part> parts) {
        this.part = parts;
    }

    public Function() {
    }

    public List<Part> getPart() {
        return part;
    }

    public void setPart(Part newPart) {
        part.add(newPart);
    }
}
