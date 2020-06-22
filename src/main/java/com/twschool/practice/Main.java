package com.twschool.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Administrator
 */
public class Main {
    private static final int RUN_TIMES = 6;


    public static void main(String[] args) throws Exception {

        while (true) {
            Game game = new Game(new RandomAnswerGeneration());
            for (int time = 0; time < RUN_TIMES; time++) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String inputString = bufferedReader.readLine();
                String[] input = inputString.split(" ");
                String result = game.playGame(input);
                if ("4A0B".equals(result)) {
                    System.out.println("胜利！");
                    break;
                }
                System.out.println(result);
            }
        }
    }
}
