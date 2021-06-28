package com.company.project;

import javax.swing.*;
import java.awt.*;

public class Frame {

    private static JFrame appFrame = new JFrame();

    public Frame() {
        appFrame.setTitle("Shape Calculator");
        appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        appFrame.setSize(1200, 800);
        appFrame.getContentPane().setBackground(Color.BLACK);
        appFrame.setLocationRelativeTo(null);
        appFrame.setLayout(null);
        appFrame.setResizable(false);
        appFrame.setVisible(true);
    }

}
