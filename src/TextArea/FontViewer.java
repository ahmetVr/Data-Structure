package TextArea;

//import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontViewer implements ActionListener{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel2_1 = new JPanel();
        JPanel panel2_2 = new JPanel();
        JPanel panel2_3 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.add(panel2_1,BorderLayout.NORTH);
        panel2.add(panel2_2,BorderLayout.CENTER);
        panel2.add(panel2_3,BorderLayout.SOUTH);

        JLabel label1 = new JLabel("Big Java");
        panel1.add(label1);

        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Serif");
        comboBox.addItem("Times New Roman");
        comboBox.addItem("Calibri");
        panel2_1.add(comboBox);

        JCheckBox checkBox = new JCheckBox("Italic");
        JCheckBox checkBox2 = new JCheckBox("Bold");
        panel2_2.add(checkBox);
        panel2_2.add(checkBox2);


        JRadioButton buttonSmall = new JRadioButton("Small");
        JRadioButton mediumButton = new JRadioButton("Medium");
        JRadioButton largeButton = new JRadioButton("Large");
        ButtonGroup group = new ButtonGroup();
        group.add(buttonSmall);
        group.add(mediumButton);
        group.add(largeButton);
        panel2_3.add(buttonSmall);
        panel2_3.add(mediumButton);
        panel2_3.add(largeButton);


        jFrame.setLayout(new GridLayout(2,1));
        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int style = 0;

    }
}
