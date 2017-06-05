package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TableViewer extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    TableViewer() {
        JPanel tablePanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        tablePanel.add(firstNumber);
        tablePanel.add(additionLabel);
        tablePanel.add(secondNumber);
        tablePanel.add(calculateButton);
        tablePanel.add(calcSolution);

        this.add(tablePanel);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed

    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    // Open a popup that contains the error message passed

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    public static void main(String[] args) {
        TableViewer theTableView = new TableViewer();

    }
}


