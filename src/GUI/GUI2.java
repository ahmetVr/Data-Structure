package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 {
    static int num1;
    static int num2;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Dice Game");
        JLabel labelWinner = new JLabel("Winner : ");
        Container content = jFrame.getContentPane();
        content.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Zar 1 : ");
        panel1.add(label1);
        panel1.setBackground(Color.cyan);
        panel1.setSize(400,400);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Zar 2 : ");
        panel2.add(label2);
        panel2.setBackground(Color.GREEN);
        panel2.setSize(400,400);

        JButton button = new JButton("Roll");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = (int)(Math.random() * 6) + 1;
                num2 = (int)(Math.random() * 6) + 1;
                if (num1 > num2) {
                    labelWinner.setText("Wınner : player2");
                } else if (num1 == num2) {
                    labelWinner.setText("TIE");
                } else {
                    labelWinner.setText("Wınner : player1");
                }
                label1.setText("Zar2 : " + num1);
                label2.setText("Zar1 : " + num2);
            }
        });

        JPanel panel3 = new JPanel();
        panel3.add(button);
        panel3.add(labelWinner);

        content.add(panel1,BorderLayout.EAST);
        content.add(panel2,BorderLayout.WEST);
        content.add(panel3,BorderLayout.CENTER);
        jFrame.setSize(500,200);
        jFrame.setVisible(true);
    }
}
