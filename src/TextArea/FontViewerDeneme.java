package TextArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontViewerDeneme {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);



        JLabel label1 = new JLabel("Big Java");




        JPanel panel1 = new JPanel();
        panel1.setSize(500,350);
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        JPanel panel2_1 = new JPanel();
        JPanel panel2_2 = new JPanel();
        JPanel panel2_3 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.add(panel2_1,BorderLayout.NORTH);
        panel2.add(panel2_2,BorderLayout.CENTER);
        panel2.add(panel2_3,BorderLayout.SOUTH);
        panel2_1.setSize(500,100);
        panel2_2.setSize(500,100);
        panel2_3.setSize(500,100);



        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Serif");
        comboBox.addItem("Times New Roman");
        comboBox.addItem("Italic");
        panel2_1.add(comboBox);

        JCheckBox cBox = new JCheckBox("Bold");
        JCheckBox cBox2 = new JCheckBox("Italic");
        panel2_2.add(cBox);
        panel2_2.add(cBox2);

        JRadioButton smallBtn = new JRadioButton("Small");
        JRadioButton mediumBtn = new JRadioButton("Medium");
        JRadioButton largeBtn = new JRadioButton("Large");
        ButtonGroup group = new ButtonGroup();
        group.add(smallBtn);
        group.add(mediumBtn);
        group.add(largeBtn);
        panel2_3.add(smallBtn);
        panel2_3.add(mediumBtn);
        panel2_3.add(largeBtn);


        comboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(source == comboBox) {
                    if(comboBox.getSelectedItem() == "Serif") {
                        label1.setFont(new Font(label1.getText(),Font.LAYOUT_LEFT_TO_RIGHT,105));
                    }else if(comboBox.getSelectedItem() == "Times New Roman") {
                        label1.setFont(new Font(label1.getText(),Font.ROMAN_BASELINE,75));
                    }else if(comboBox.getSelectedItem() == "Italic") {
                        label1.setFont(new Font(label1.getText(),Font.ITALIC,112));
                    }
                }

              if(source == cBox) {
                  label1.setFont(new Font(label1.getText(),Font.BOLD,170));

              }else if(source == cBox2) {
                  label1.setFont(new Font(label1.getText(),Font.ITALIC,50));
              }


            }
        });



        jFrame.setLayout(new GridLayout(2,1));

        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.setVisible(true);
    }

}
