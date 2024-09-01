package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.awt.BorderLayout.*;

public class ButtonGame extends JFrame implements ActionListener {
    JButton button;
    JPanel panel;
    private Timer timer;
    private int x,y;
    static int buttonGameCount = 0;
    static int gameTime;
    public ButtonGame(int time) {
        gameTime = time;
        setSize(400,400);
        setTitle("Button Game");
        button = new JButton("Click Me!");
        panel = new JPanel();
        panel.add(button);
        button.addActionListener(this);
        add(panel);
        setVisible(true);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameTime--;
                setTitle("Button Game-- Time is " + gameTime);
                if(gameTime == 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(ButtonGame.this,"Tıme ıs over! You clıcked: " + buttonGameCount + " tımes...");
                    System.exit(0);
                }
            }
        });
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        buttonGameCount++;
        changeLoc();
    }

    public void changeLoc() {
        Random random = new Random();
        x =  random.nextInt(panel.getWidth() - button.getWidth());
        y =  random.nextInt(panel.getHeight() - button.getHeight());
        button.setLocation(x,y);
    }
}
