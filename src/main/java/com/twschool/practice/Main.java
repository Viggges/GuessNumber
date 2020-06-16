package com.twschool.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {
    private static final int RUN_TIMES = 6;

    public static void main(String[] args) throws Exception {
        while (true) {
            String[] answer = Generation.getAnswer();

            for (int time = 0; time < RUN_TIMES; time++) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String inputString = bufferedReader.readLine();
                if("lw".equals(inputString)){
                    System.out.println(answer[0]+answer[1]+answer[2]+answer[3]);
                    break;
                }
                String[] input = inputString.split(" ");

                if("4A0B".equals(Game.playGame(input, answer))){
                    System.out.println("就这？");
                    break;
                }
                System.out.println(Game.playGame(input, answer));
            }
        }
    }
}
