package com.twschool.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class GuessNumberTest {
    Game game;
    @Before
    public void setUp() throws Exception{
        Answer answer = new Answer(Arrays.asList("1","2","3","4"));
        RandomAnswerGeneration mock = Mockito.mock(RandomAnswerGeneration.class);
        Mockito.when(mock.getAnswer()).thenReturn(answer);
        game = new Game(mock);
    }
    @Test
    public void should_return_4A0B_input_1234() {
        //given
        String[] input = {"1", "2", "3", "4"};
//        String[] answer = {"1", "2", "3", "4"};

        //when
        String result = game.playGame(input);
        //then
        Assert.assertEquals("4A0B", result);
        System.out.println(result + "   " + "win, all correct");
    }

    @Test
    public void should_return_0A0B_input_5678() {
        //given
        String[] input = {"5", "6", "7", "8"};

        //when
        String result = game.playGame(input);
        //then
        Assert.assertEquals("0A0B", result);

        System.out.println(result + "   " + "all wrong");
    }

    @Test
    public void should_return_1A2B_input_2436() {
        //given
        String[] input = {"2", "4", "3", "6"};

        //when
        String result = game.playGame(input);
        //then
        Assert.assertEquals("1A2B", result);

        System.out.println(result + "   " + "all wrong");
    }

    @Test
    public void should_return_0A1B_input_2789() {
        //given

        String[] input = {"2", "7", "8", "9"};

        //when
        String result = game.playGame(input);
        //then
        Assert.assertEquals("0A1B", result);

        System.out.println(result + "   " + "all wrong");
    }

    @Test
    public void should_return_1A0B_input_1789() {
        //given
        String[] input = {"1", "7", "8", "9"};

        //when
        String result = game.playGame(input);
        //then
        Assert.assertEquals("1A0B", result);

        System.out.println(result + "   " + "all wrong");
    }

    @Test
    public void should_return_0A4B_input_4321() {
        //given

        String[] input = {"4", "3", "2", "1"};

        //when
        String result = game.playGame(input);
        //then
        Assert.assertEquals("0A4B", result);

        System.out.println(result + "   " + "all wrong");
    }
}
