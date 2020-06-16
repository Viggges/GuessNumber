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
        for (int time = 0; time < RUN_TIMES; time++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();
            String[] input = inputString.split(" ");
            String[] answer = Generation.getAnswer();

            System.out.println(Game.playGame(input, answer));
        }
    }
}
