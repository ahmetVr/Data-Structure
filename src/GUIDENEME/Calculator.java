package GUIDENEME;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
     JFrame jFrame = new JFrame();
     jFrame.setSize(500,300);

     Container content = jFrame.getContentPane();

     JPanel panel1 = new JPanel();
     TextField display = new TextField(5);
     panel1.add(display);
     panel1.setSize(500,100);
     JLabel label1 = new JLabel();
     panel1.add(label1);

     JPanel panel2 = new JPanel();
     panel2.setSize(250,200);

     JPanel panel3 = new JPanel();
     panel3.setSize(250,200);

     JButton button1 = new JButton("1");
     JButton button2 = new JButton("2");
     JButton button3 = new JButton("3");
     JButton button4 = new JButton("4");
     JButton button5 = new JButton("5");
     JButton button6 = new JButton("6");
     JButton button7 = new JButton("7");
     JButton button8 = new JButton("8");
     JButton button9 = new JButton("+");
     JButton button10 = new JButton("-");
     JButton button11 = new JButton("*");
     JButton button12 = new JButton("/");

     panel1.add(button9);
     panel1.add(button10);
     panel1.add(button11);
     panel1.add(button12);
     panel2.add(button1);
     panel2.add(button2);
     panel2.add(button3);
     panel2.add(button4);
     panel3.add(button5);
     panel3.add(button6);
     panel3.add(button7);
     panel3.add(button8);







     content.add(panel1,BorderLayout.CENTER);
     content.add(panel2,BorderLayout.WEST);
     content.add(panel3,BorderLayout.EAST);

     jFrame.setVisible(true);
    }
}
