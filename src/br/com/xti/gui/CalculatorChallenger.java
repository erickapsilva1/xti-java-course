package br.com.xti.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorChallenger extends JFrame implements ActionListener {

    JTextField display, displayResult;
    JButton zero, one, two, three, four, five, six, seven, eight, nine;
    JButton percentage, clear, clearEntry, clearNumber;
    JButton addition, subtraction, multiplication, division, dot, equal;
    String operation;


    public double firstNumber, secondNumber;

    public CalculatorChallenger() {
        super("Calculator Challenger V2");

        display = new JTextField();
        display.setFont(new Font("serif", Font.PLAIN, 26));
        display.setEditable(false);
        display.setBackground(Color.WHITE);

        displayResult = new JTextField();
        displayResult.setFont(new Font("serif", Font.PLAIN, 26));
        displayResult.setEditable(false);

        zero = new JButton();
        one = new JButton();
        two = new JButton();
        three = new JButton();
        four = new JButton();
        five = new JButton();
        six = new JButton();
        seven = new JButton();
        eight = new JButton();
        nine = new JButton();
        addition = new JButton();
        subtraction = new JButton();
        multiplication = new JButton();
        division = new JButton();
        dot = new JButton();
        equal = new JButton();
        percentage = new JButton();
        clear = new JButton();
        clearEntry = new JButton();
        clearNumber = new JButton();

        zero.setText("0");
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        addition.setText("+");
        subtraction.setText("-");
        multiplication.setText("*");
        division.setText("/");
        dot.setText(".");
        equal.setText("=");
        percentage.setText("%");
        clear.setText("C");
        clearEntry.setText("CE");
        clearNumber.setText("<");

        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        dot.addActionListener(this);

        addition.addActionListener(new OperationListener());
        subtraction.addActionListener(new OperationListener());
        multiplication.addActionListener(new OperationListener());
        division.addActionListener(new OperationListener());
        percentage.addActionListener(new OperationListener());
        equal.addActionListener(new EqualListener());

        clear.addActionListener(new ClearListener());
        clearEntry.addActionListener(new ClearListener());
        clearNumber.addActionListener(new ClearListener());

        Container container = getContentPane();
        Container container1 = new JPanel();
        Container container2 = new JPanel();
        container2.setLayout(new GridLayout(2,1));

        container2.add(displayResult);
        container2.add(display);

        container.setLayout(new BorderLayout(3, 1));

        container1.setLayout(new GridLayout(5, 4, 4, 4));
        container1.add(percentage);
        container1.add(clear);
        container1.add(clearEntry);
        container1.add(clearNumber);
        container1.add(seven);
        container1.add(eight);
        container1.add(nine);
        container1.add(division);
        container1.add(four);
        container1.add(five);
        container1.add(six);
        container1.add(multiplication);
        container1.add(one);
        container1.add(two);
        container1.add(three);
        container1.add(subtraction);
        container1.add(zero);
        container1.add(dot);
        container1.add(equal);
        container1.add(addition);

        container.add(BorderLayout.NORTH, container2);
        container.add(BorderLayout.CENTER, container1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorChallenger();
    }

    void clearMemory() {
        firstNumber = 0;
        secondNumber = 0;
    }

    void clearDisplay(){
        display.setText("");
        displayResult.setText("");
    }

    class ClearListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clear) {
                clearMemory();
                clearDisplay();
            } else if (e.getSource() == clearEntry) {
                display.setText("");
            } else if (e.getSource() == clearNumber) {
                if (!display.getText().isEmpty()) {
                    display.setText(display.getText().substring(0, display.getText().length() - 1));
                }
            }
        }
    }

    class OperationListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == addition) {
                operation = "addition";
                firstNumber = Double.parseDouble(display.getText());
            } else if (e.getSource() == subtraction) {
                operation = "subtraction";
                firstNumber = Double.parseDouble(display.getText());
            } else if (e.getSource() == multiplication) {
                operation = "multiplication";
                firstNumber = Double.parseDouble(display.getText());
            } else if (e.getSource() == division) {
                operation = "division";
                firstNumber = Double.parseDouble(display.getText());
            } else if (e.getSource() == percentage) {
                operation = "percentage";
            }

            if(!operation.equals("percentage")) {
                displayResult.setText(display.getText() + " " + e.getActionCommand() + " ");
                display.setText("");
            }else{
                displayResult.setText(displayResult.getText()
                        + display.getText() + " "
                        + e.getActionCommand() + " ");
                //display.setText("");
            }
        }
    }

    class EqualListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(!operation.equals("percentage")) {
                displayResult.setText(displayResult.getText() + display.getText() + " = ");
            }else{
                displayResult.setText(displayResult.getText() + " = ");
            }

            if (operation != null) {
                secondNumber = Double.parseDouble(display.getText());

                switch (operation) {
                    case "addition" -> display.setText(String.valueOf(firstNumber + secondNumber));
                    case "subtraction" -> display.setText(String.valueOf(firstNumber - secondNumber));
                    case "multiplication" -> display.setText(String.valueOf(firstNumber * secondNumber));
                    case "division" -> {
                        if (secondNumber != 0) {
                            display.setText(String.valueOf(firstNumber / secondNumber));
                        } else {
                            display.setText("Cannot divide by zero");
                        }
                    }
                    case "percentage" -> {

                        display.setText(String.valueOf((firstNumber * secondNumber) / 100));
                    }
                }
                clearMemory();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        display.setText(display.getText() + e.getActionCommand());
    }
}
