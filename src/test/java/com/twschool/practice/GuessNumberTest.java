package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.Answer;

public class GuessNumberTest {
    @Test
    public void should_allRight_given1234() {
        //given
        Answer answer = new Answer();

        //when
        String result = answer.excute();
        //then
        Assert.assertEquals(result,"win,newbee");
    }
}
