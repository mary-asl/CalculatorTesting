package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalculatorTest {

    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "StringDataProvider")
    public SumDoubleTest(String a, String b, String expected) {
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
        this.expected = Double.parseDouble(expected);
    }

    @Factory(dataProvider = "DoubleDataProvider")
    public SumDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(groups = "main")
    public void sumDoubleTest() {
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, "incorrect summation result");
    }

    @DataProvider(name = "StringDataProvider")
    public static Object[][] StringDataProvider() {
        return new Object[][]{
                {"13", "1", "14"},
                {"0", "0", "0"},
        };
    }

    @DataProvider(name = "DoubleDataProvider")
    public static Object[][] DoubleDataProvider() {
        return new Object[][]{
                {1, 1, 2},
                {0, 0, 0},
                {0.5, 1, 1.5}
        };
    }
}
