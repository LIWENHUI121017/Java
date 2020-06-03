package com.day07;

import javax.swing.*;
import java.awt.*;

public class TestRunnable extends JFrame implements Runnable {
    public static void main(String[] args) {
        TestRunnable r = new TestRunnable();
        r.setSize(300,300);
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread t= new Thread(r);
        t.start();

    }

    @Override
    public void run() {
        int i = 0;
        JPanel panel = new JPanel();
        panel.setSize(300, 300);
        this.setContentPane(panel);
        while (true) {
            i = i == 0 ? 1 : 0;
            if (i == 0) {
                panel.setBackground(Color.BLACK);
            } else {
                panel.setBackground(Color.RED);
            }
        }


    }
}