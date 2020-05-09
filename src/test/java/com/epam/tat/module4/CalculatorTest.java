package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sumLongTest() {
        long result1 = calculator.sum(200000, 300099);
        Assert.assertEquals(result1, 500099);
    }

    @Test
    public void sumDoubleTest() {
        double result = calculator.sum(1, 2);
        Assert.assertEquals(result, 3, "incorrect summation result");
    }

    @Test
    public void subDoubleTest() {
        double result = calculator.sum(12.1, 32.1);
        Assert.assertEquals(result, 44.2, "incorrect result");
    }

    @Test
    public void subLongTest() {
        long result1 = calculator.sum(123411, 123411);
        Assert.assertEquals(result1, 246822, "incorrect result");
    }

    @Test
    public void multDoubleTest() {
        double result = calculator.mult(0.1, 0.1);
        Assert.assertEquals(result, 0.01, "incorrect result");
    }

    @Test
    public void multLongTest() {
        long result1 = calculator.mult(20, 20);
        Assert.assertEquals(result1, 400, "incorrect result");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divLongTest() {
        calculator.div(2, 0);
    }

    @Test()
    public void divDoubleTest() {
        double result = calculator.div(0.4, 2);
        Assert.assertEquals(result, 0.2, "incorrect result");
    }

    @Test()
    public void powTest() {
        double result = calculator.pow(2, 2);
        Assert.assertEquals(result, 4, "incorrect result");
    }

    @Test()
    public void sqrtTest() {
        double result = calculator.sqrt(4);
        Assert.assertEquals(result, 2, "incorrect result");
    }

    @Test()
    public void tgTest() {
        double result = calculator.tg(45);
        Assert.assertEquals(result, 1.0, "incorrect result");
    }

    @Test()
    public void ctgTest() {
        double result = calculator.ctg(30);
        Assert.assertEquals(result, Math.sqrt(3), "incorrect result");
    }

    @Test()
    public void cosTest() {
        double result = calculator.cos(30);
        Assert.assertEquals(result, 0.8660254037844386, "incorrect result");
    }

    @Test()
    public void sinTest(){
        double result = calculator.sin(30);
        Assert.assertEquals(result, 0.5, "incorrect result");
    }

    @Test()
    public void isPositiveTest(){
        Assert.assertFalse(calculator.isPositive(-1));
        Assert.assertTrue(calculator.isPositive(1));
    }

    @Test()
    public void isNegativeTest(){
        Assert.assertTrue(calculator.isNegative(-1));
        Assert.assertFalse(calculator.isNegative(1));
    }

}
