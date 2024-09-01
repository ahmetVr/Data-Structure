package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    static int result = 0;
    static int number1 = 0;
    static int number2 = 0;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Result : " + result);
        JButton button1 = new JButton("+");
        JButton button2 = new JButton("-");
        JButton button3 = new JButton("*");
        JButton button4 = new JButton("/");
        JButton button5 = new JButton("=");
        JButton button6 = new JButton("C");
        JTextField textField = new JTextField(5);



        jFrame.add(textField);
        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.add(button3);
        jFrame.add(button4);
        jFrame.add(button6);
        jFrame.add(label1);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result += Integer.parseInt(textField.getText());
                textField.setText("");
                label1.setText("Total Money :" + result);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Integer.parseInt(textField.getText());
                label1.setText("Total Money :" + result);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Integer.parseInt(textField.getText());
                label1.setText("Total Money :" + result);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Integer.parseInt(textField.getText());
                label1.setText("Total Money :" + result);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                result = 0;
                label1.setText("Total Money :" + result);
            }
        });

        jFrame.setVisible(true);
    }
}
