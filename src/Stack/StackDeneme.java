package Stack;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.awt.Color.RED;
import static java.awt.Color.lightGray;

public class StackDeneme {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        JFrame jFrame = new JFrame();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(8);
        System.out.println("**********************");
        for(int i = 0; i < stack1.size(); i++) {
            if(stack1.get(i) % 2 == 0) {
                list1.add(stack1.get(i));

            }else {
               queue1.add(stack1.get(i));
            }
        }
        System.out.println("***************************");
        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }



        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();


        JLabel label1 = new JLabel("1");
        JLabel label2 = new JLabel("2");
        JLabel label3 = new JLabel("3");
        JLabel label4 = new JLabel("4");
        JLabel label5 = new JLabel("5");
        JLabel label6 = new JLabel("6");

        JButton button1 = new JButton("CLICK");
        JButton button2 = new JButton("CLICK");
        JButton button3 = new JButton("CLICK");
        JButton button4 = new JButton("CLICK");
        JButton button5 = new JButton("CLICK");
        JButton button6 = new JButton("CLICK");
        button1.setBackground(RED);
        button2.setBackground(RED);
        button3.setBackground(RED);
        button4.setBackground(RED);
        button5.setBackground(RED);
        button6.setBackground(RED);

        jFrame.setLayout(new GridLayout(3,3));
        panel1.setBackground(lightGray);
        panel2.setBackground(lightGray);
        panel3.setBackground(lightGray);
        panel4.setBackground(lightGray);
        panel5.setBackground(lightGray);
        panel6.setBackground(lightGray);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setLocation(15,56);
                label1.setVisible(false);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setLocation(56,15);
                label2.setVisible(false);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       //         RotateTransition rotate = new RotateTransition();  //creating object for Rotate Transition
         //       rotate.play();
                label3.setVisible(false);
            }
        });



        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);
        panel5.add(label5);
        panel6.add(label6);
        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
        panel6.add(button6);
        jFrame.add(panel1);
        jFrame.add(panel2);
        jFrame.add(panel3);
        jFrame.add(panel4);
        jFrame.add(panel5);
        jFrame.add(panel6);
       jFrame.setVisible(true);

    }
}
