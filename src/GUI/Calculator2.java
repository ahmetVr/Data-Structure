package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 extends JFrame implements ActionListener {

    private JTextField display;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonClear;

    private double firstNumber;
    private double secondNumber;
    private double result;
    private String operations;

    public Calculator2() {
        setLayout(new FlowLayout());
        display = new JTextField(10);
        add(display);

        button1 = new JButton("1");
        add(button1);
        button1.addActionListener(this);

        button2 = new JButton("2");
        add(button2);
        button2.addActionListener(this);

        button3 = new JButton("3");
        add(button3);
        button3.addActionListener(this);

        button4 = new JButton("4");
        add(button4);
        button4.addActionListener(this);

        button5 = new JButton("5");
        add(button5);
        button5.addActionListener(this);

        button6 = new JButton("6");
        add(button6);
        button6.addActionListener(this);

        button7 = new JButton("7");
        add(button7);
        button7.addActionListener(this);

        button8 = new JButton("8");
        add(button8);
        button8.addActionListener(this);

        button9 = new JButton("9");
        add(button9);
        button9.addActionListener(this);

        button0 = new JButton("0");
        add(button0);
        button0.addActionListener(this);

        buttonAdd = new JButton("+");
        add(buttonAdd);
        buttonAdd.addActionListener(this);

        buttonSubtract = new JButton("-");
        add(buttonSubtract);
        buttonSubtract.addActionListener(this);

        buttonMultiply = new JButton("*");
        add(buttonMultiply);
        buttonMultiply.addActionListener(this);

        buttonDivide = new JButton("/");
        add(buttonDivide);
        buttonDivide.addActionListener(this);

        buttonEquals = new JButton("=");
        add(buttonEquals);
        buttonEquals.addActionListener(this);

        buttonClear = new JButton("Clear");
        add(buttonClear);
        buttonClear.addActionListener(this);

        setSize(200, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (event.getSource() == button1) {
            display.setText(display.getText() + "1");
        } else if (source == button2) {
            display.setText(display.getText() + "2");
        } else if (source == button3) {
            display.setText(display.getText() + "3");
        } else if (source == button4) {
            display.setText(display.getText() + "4");
        } else if (source == button5) {
            display.setText(display.getText() + "5");
        } else if (source == button6) {
            display.setText(display.getText() + "6");
        } else if (source == button7) {
            display.setText(display.getText() + "7");
        } else if (source == button8) {
            display.setText(display.getText() + "8");
        } else if (source == button9) {
            display.setText(display.getText() + "9");
        } else if (source == button0) {
            display.setText(display.getText() + "0");
        } else if (source == buttonAdd) {
            firstNumber = Double.parseDouble(display.getText());
            display.setText("");
            operations = "+";
        } else if (source == buttonSubtract) {
            firstNumber = Double.parseDouble(display.getText());
            display.setText("");
            operations = "-";
        } else if (source == buttonMultiply) {
            firstNumber = Double.parseDouble(display.getText());
            display.setText("");
            operations = "*";
        } else if (source == buttonDivide) {
            firstNumber = Double.parseDouble(display.getText());
            display.setText("");
            operations = "/";
        } else if (source == buttonEquals) {
            secondNumber = Double.parseDouble(display.getText());
            if (operations == "+") {
                result = firstNumber + secondNumber;
                display.setText(Double.toString(result));
            } else if (operations == "-") {
                result = firstNumber - secondNumber;
                display.setText(Double.toString(result));
            } else if (operations == "*") {
                result = firstNumber * secondNumber;
                display.setText(Double.toString(result));
            } else if (operations == "/") {
                result = firstNumber / secondNumber;
                display.setText(Double.toString(result));
            }
        } else if (source == buttonClear) {
            display.setText("");
        }
    }

    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
    }
}