package com.twschool.practice;

public class Game {


    public static String playGame(int[] input, int[] answer) {
        int valueRight = 0;
        int allRight = 0;
        int inputIndex = 0;
        for (int inputNumber : input) {
            int answerIndex = 0;
            for (int answerNumber : answer) {

                if (inputNumber == answerNumber) {
                    if (inputIndex == answerIndex) {
                        allRight++;
                    } else {
                        valueRight++;
                    }
                }
                answerIndex++;
            }
            inputIndex++;
        }
        return allRight+"A"+valueRight+"B";
    }
}
