package com.java.patterns.headfirst.ch8.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author gongchunru
 * @create 2018-10-10 3:21 PM
 */
public class TeaWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping Tea through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }


    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }


    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like lemon ans sugar with your tea (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            return "no";
        }

        return answer;

    }
}
