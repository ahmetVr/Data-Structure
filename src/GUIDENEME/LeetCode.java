package GUIDENEME;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("First GUI");
        jFrame.setSize(400,400);

        JPanel panel1 = new JPanel();


        JLabel label1 = new JLabel();
        label1.setText("Ahmet Var");


        JButton button1 = new JButton("CLICK");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(label1.getText().equals("Ahmet Var")) {
                    label1.setText("Kerem Kesgin");
                }else {
                    label1.setText("Ahmet Var");
                }
            }
        });







        panel1.add(button1);
        panel1.add(label1);
        jFrame.add(panel1);
        jFrame.setVisible(true);
    }

}
