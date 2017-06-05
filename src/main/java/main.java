import Func.CalcArgAndValue;
import Func.Function;
import Func.Rules;
import Input.FunctionInput;
import Input.Inputs;
import Input.RulesInput;
import TableModul.Column;
import TableModul.Table;
import TableModul.TableHeader;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Rules rules = new Rules();
        RulesInput rulesInput = new RulesInput(rules);
        Function function = new Function();
        FunctionInput functionInput = new FunctionInput(function);

        Inputs inputs = new Inputs(functionInput, rulesInput);
        CalcArgAndValue calcArgAndValue = new CalcArgAndValue(rules, function);

        inputs.inputs();
        calcArgAndValue.calcArgAndValue();

        List<Column> columns = new ArrayList<Column>();
        ArrayList<Double> col1 = (ArrayList<Double>) calcArgAndValue.arg;
        ArrayList<Double> col2 = (ArrayList<Double>) calcArgAndValue.value;
        columns.add(new Column("X", col1));
        columns.add(new Column("Y", col2));

        Table table = new Table(new TableHeader("Таблица"), columns);
        table.assemblyTable();
    }
}
