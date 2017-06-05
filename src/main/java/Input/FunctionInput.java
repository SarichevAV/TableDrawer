package Input;

import Func.Function;
import Func.Part;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionInput {
    public static final String PART_COUNT = "Ввведите колличество участков : ";
    public static final String L_BORDER = "Введите левую границу участка A = ";
    public static final String R_BORDER = "Введите правую границу участка B = ";
    public static final String FORMULA = "Введите формулу y = ";

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public Function function;

    public FunctionInput(Function function) {
        this.function = function;
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean checkBorder(double left, double right) {
        boolean result = true;
        for (Part part : function.getParts()) {
            if ((left >= part.getLeftBorder() && left < part.getRightBorder()) |
                    (right >= part.getLeftBorder() && right < part.getRightBorder())) result = false;
        }
        return result;
    }

    public void inputFunction() throws IOException {
        int countParts;

        System.out.print(PART_COUNT);
        countParts = Integer.parseInt(reader.readLine());
        if (isPositive(countParts)) {
            inputParts(countParts);
        } else {
            System.out.println("Графика нет, конец программы!");
        }
    }

    public void inputParts(int countParts) throws IOException {
        double leftBorder;
        double rightBorder;
        String formula;

        while (countParts >= 1 ) {
            System.out.print(L_BORDER);
            leftBorder = Double.parseDouble(reader.readLine());
            System.out.print(R_BORDER);
            rightBorder = Double.parseDouble(reader.readLine());
            System.out.print(FORMULA);
            formula = reader.readLine();
            System.out.println();
            if (checkBorder(leftBorder, rightBorder)) {
                function.addPart(new Part(leftBorder, rightBorder, formula));
                countParts--;
            } else {
                System.out.println("Введите коректные значения границ участка");
            }
        }
    }

}
