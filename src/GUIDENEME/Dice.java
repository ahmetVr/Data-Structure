package GUIDENEME;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dice {
   static int player1;
   static int player2;
    public static void main(String[] args) {
       JFrame jFrame = new JFrame("DICE");
       jFrame.setSize(400,400);

       Container content = jFrame.getContentPane();


       JPanel panel1 = new JPanel();
       panel1.setBackground(Color.RED);
       panel1.setSize(300,300);

       JPanel panel2 = new JPanel();
       panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setSize(300,300);

       JPanel panel3 = new JPanel();
       panel3.setBackground(Color.lightGray);
        panel3.setSize(300,300);


        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

       JButton button1 = new JButton("DO IT!");

       button1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               player1 = (int) ((Math.random() * 6) + 1);
               player2 = (int) (Math.random() * 6) + 1;

               if(player1 > player2) {
                   label1.setText("Score : " + player1);
                   label2.setText("Score : " + player2);
                   label3.setText("Winner is Player1");
               }else if(player1 == player2) {
                   label3.setText("TIE");
                   label1.setText("Score : " + player1);
                   label2.setText("Score : " + player2);
               }else {
                   label1.setText("Score : " + player1);
                   label2.setText("Score : " + player2);
                   label3.setText("Winner is Player2");
               }
           }
       });

        panel1.add(label1);
        panel2.add(label2);
        panel3.add(button1);
        panel3.add(label3);
        content.add(panel1,BorderLayout.WEST);
        content.add(panel2, BorderLayout.EAST);
        content.add(panel3,BorderLayout.CENTER);
        jFrame.setVisible(true);
    }
}
