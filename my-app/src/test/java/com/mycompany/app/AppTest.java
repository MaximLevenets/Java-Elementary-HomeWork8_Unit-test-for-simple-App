package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
    App sum, minus, multiply, divide;

    @Before
    public void setUp() throws Exception{
        sum = new App();
        minus = new App();
        multiply = new App();
        divide = new App();
    }

    @Test
    public void testPlus() throws Exception{
        Assert.assertEquals(4,sum.plus(2,2));
    }

    @Test
    public void testMinus() throws Exception{
        Assert.assertEquals(2,minus.minus(6,4));
    }

    @Test
    public void testMultiply() throws Exception{
        Assert.assertEquals(6, multiply.multiply(2,3));
    }

    @Test
    public void testDivide() throws Exception{
        Assert.assertEquals(2,divide.divide(6,3));
    }
}
