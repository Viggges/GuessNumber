package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_input_1234() {
        //given
        int[] input = {1,2,3,4};
        int[] answer = {1,2,3,4};
        //when
        String result = Game.playGame(input,answer);
        //then
        Assert.assertEquals("4A0B", result);
        System.out.println(result+ "   "+"win, all correct");
    }
    @Test
    public void should_return_0A0B_input_5678() {
        //given
        int[] input = {5,6,7,8};
        int[] answer = {1,2,3,4};
        //when
        String result = Game.playGame(input,answer);
        //then
        Assert.assertEquals("0A0B", result);

        System.out.println(result + "   "+"all wrong");
    }
}
