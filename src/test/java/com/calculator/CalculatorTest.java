package com.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private final App calculator = new App();

    @Test
    public void testAdd() {
        int result = calculator.add(5, 3);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(3, 7);
        Assert.assertEquals(result, 21);
    }

    @Test
    public void testDivide() {
        int result = calculator.divide(15, 5);
        Assert.assertEquals(result, 3);
    }
}