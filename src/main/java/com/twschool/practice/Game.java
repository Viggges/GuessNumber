package com.twschool.practice;

public class Game {

    RandomAnswerGeneration randomAnswerGeneration;
    Answer answer;

    public Game(RandomAnswerGeneration randomAnswerGeneration) {
        this.randomAnswerGeneration = randomAnswerGeneration;
        this.answer = this.randomAnswerGeneration.getAnswer();
    }

    public String playGame(String[] input) {
        String[] answerArray = (String[]) answer.getAnswer().toArray();
        System.out.println("答案是：" + answerArray[0] + answerArray[1] + answerArray[2] + answerArray[3]);
        int valueRight = 0;
        int allRight = 0;
        int inputIndex = 0;
        for (String inputNumber : input) {
            int answerIndex = 0;
            for (String answerNumber : answerArray) {

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
