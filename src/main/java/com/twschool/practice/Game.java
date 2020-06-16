package com.twschool.practice;

public class Game {


    public static String playGame(String[] input, String[] answer) {
        int valueRight = 0;
        int allRight = 0;
        int inputIndex = 0;
        for (String inputNumber : input) {
            int answerIndex = 0;
            for (String answerNumber : answer) {

                if (inputNumber.equals(answerNumber)) {
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
        return allRight + "A" + valueRight + "B";
    }
}
