package Input;

import Func.Rules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RulesInput {
    public static final String START = "Введите правила, по которым будет составляться таблица";
    public static final String LEFT_BORDER = "Введите левую границу A = ";
    public static final String RIGHT_BORDER = "Введите правую границу B = ";
    public static final String STEP = "Введите шаг step = ";

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Rules rules;

    public RulesInput(Rules rules) {
        this.rules = rules;
    }

    public void inputRules() throws IOException {
        int leftBorder;
        int rightBorder;
        double step;

        System.out.print(START+"\n"+LEFT_BORDER);
        leftBorder = Integer.parseInt(reader.readLine());
        System.out.print(RIGHT_BORDER);
        rightBorder = Integer.parseInt(reader.readLine());
        System.out.print(STEP);
        step = Double.parseDouble(reader.readLine());

        rules.setLeftBorder(leftBorder);
        rules.setRightBorder(rightBorder);
        rules.setStep(step);
    }
}
