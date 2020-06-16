package com.twschool.practice;

import java.util.Random;

/**
 * @author Administrator
 */
public class Generation {
    public static String[] getAnswer() {
        String[] answer = new String[4];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            answer[i] = String.valueOf(r.nextInt(10));
        }
        return answer;
    }
}
