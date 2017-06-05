package Func;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private List<Part> parts = new ArrayList<>();

    public Function(List<Part> parts) {
        this.parts = parts;
    }

    public Function() {
    }

    public List<Part> getParts() {
        return parts;
    }

    public void addPart(Part part) {
        parts.add(part);
    }

}
