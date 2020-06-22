package com.twschool.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Administrator
 */
public class Main {
    private static final int RUN_TIMES = 6;


    public static void main(String[] args) throws Exception {
        Game game;
        RandomAnswerGeneration randomAnswerGeneration;
        while (true) {
            String[] answer = randomAnswerGeneration.getAnswer();

            for (int time = 0; time < RUN_TIMES; time++) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String inputString = bufferedReader.readLine();
                if ("lw".equals(inputString)) {
                    System.out.println(answer[0] + answer[1] + answer[2] + answer[3]);
                    break;
                }
                String[] input = inputString.split(" ");

                if ("4A0B".equals(game.playGame(input, answer))) {
                    System.out.println("就这？");
                    break;
                }
                System.out.println(game.playGame(input, answer));
            }
        }
    }
}
