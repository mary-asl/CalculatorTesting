package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseCalculatorTest {
    @Test(dependsOnMethods = "testDiv", alwaysRun = true, expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        double div = calculator.div(1, 0);
    }

    @Test(dataProvider = "divDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testDiv(double a, double b, double expected) {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected, "incorrect div result");
    }

    @Test(groups = "special")
    public void testDivByInfinity() {
        double result = calculator.div(0, Double.POSITIVE_INFINITY);
        Assert.assertEquals(result, 0, "incorrect div by infinity");
    }

    @Test(groups = "special")
    public void testDivInfinityByNum() {
        double result = calculator.div(Double.POSITIVE_INFINITY, 0);
        Assert.assertEquals(result, Double.POSITIVE_INFINITY, "incorrect div by infinity");
    }

    @Test(groups = "special")
    public void testInfinityByInfinity() {
        double result = calculator.div(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        Assert.assertEquals(result, Double.NaN, "incorrect div by infinity");
    }

    @DataProvider(name = "divDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {-10, 10, -1},
                {-10, -10, 1},
                {10, 10, 1},
                {-10.5, 10, -1.05},
                {0, 10, 0},
        };
    }
}
