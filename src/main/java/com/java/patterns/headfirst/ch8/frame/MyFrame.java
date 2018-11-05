package com.java.patterns.headfirst.ch8.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @author gongchunru
 * @create 2018-10-11 2:35 PM
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I rule!";
        graphics.drawString(msg,100,100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
