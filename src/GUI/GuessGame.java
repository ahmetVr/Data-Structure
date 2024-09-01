package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame {
    static int randomNumber =  (int) (Math.random() * 100 + 1);
    static int count;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300,100);

        jFrame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();


        JLabel label1 = new JLabel();
        label1.setText("Guess a number between 1 to 100");

        JTextField textField = new JTextField(10);

        JButton button = new JButton("Guess");
        panel1.add(textField);
        panel1.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if(Integer.parseInt(textField.getText()) < randomNumber) {
                    label1.setText("This number is too low.Try Again!");
                }else if(Integer.parseInt(textField.getText()) > randomNumber) {
                    label1.setText("This number is too high.Try Again!");
                }else {
                    JOptionPane.showMessageDialog(jFrame,"You Won.You found this number after " + count + " attempt.");
                    System.exit(0);
                }

            }
        });
        jFrame.add(label1,BorderLayout.NORTH);
        jFrame.add(panel1, BorderLayout.CENTER);
        jFrame.setVisible(true);
    }
}
