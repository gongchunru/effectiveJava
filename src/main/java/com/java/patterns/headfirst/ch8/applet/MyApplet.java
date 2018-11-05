package com.java.patterns.headfirst.ch8.applet;

import java.applet.Applet;
import java.awt.*;

/**
 * @author gongchunru
 * @create 2018-10-11 2:45 PM
 */
public class MyApplet extends Applet {
    String message;


    public void init() {
        message = "Hello World, I'm alive!";
    }

    public void start() {
        message = "Now I'm starting up...";
    }


    public void stop() {
        message = "Oh, now I'm being stopped";
        repaint();
    }


    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }


}
