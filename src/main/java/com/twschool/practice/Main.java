package com.twschool.practice;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int[] input = new int[4];
        int[] answer = {1, 2, 3, 4};
        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            input[i] = inputScanner.nextInt();
        }
        System.out.println(Game.playGame(input, answer));

    }
}
