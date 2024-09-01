package TextArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuıTextArea {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Text Area");
        jFrame.setSize(500,500);

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel();
        label1.setText("Number : ");
        JTextField textField = new JTextField(15);
        JButton button1 = new JButton("Add Number");
        panel1.add(label1);
        panel1.add(textField);
        panel1.add(button1);


        JPanel panel2 = new JPanel();
        JTextArea textArea = new JTextArea(10,30);
        JScrollPane scPane = new JScrollPane(textArea);
        panel2.add(scPane);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText() + "\n");
            }
        });

        jFrame.setLayout(new GridLayout(2,1));
        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.setVisible(true);
    }
}
