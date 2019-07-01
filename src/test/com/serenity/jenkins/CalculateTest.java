package com.serenity.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {


    @Test
    public void addition() {
        int actual = Calculate.addition(4, 2);
        int expected = 8;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplication() {
        int actual = Calculate.multiplication(4, 2);
        int expected = 8;
        Assert.assertEquals(expected, actual);
    }
}
