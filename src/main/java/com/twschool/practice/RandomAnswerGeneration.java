package com.twschool.practice;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Administrator
 */
public class RandomAnswerGeneration {
    public  Answer getAnswer() {
        String[] answers = new String[4];
        int[] numberUse = new int[10];
        Random r = new Random();
        int answer ;
        for (int i = 0; i < 4; i++) {
            answer = r.nextInt(10);
            while (true) {
                if (numberUse[answer] == 0) {
                    break;
                } else {
                    answer = r.nextInt(10);
                }

            }
            numberUse[answer]++;
            answers[i] = String.valueOf(answer);
        }
        return new Answer(Arrays.asList(answers));
    }
}
