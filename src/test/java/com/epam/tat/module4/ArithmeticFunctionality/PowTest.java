package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends BaseCalculatorTest {
    @Test(dataProvider = "powDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testPow(double a,double b, double expected) {
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected, "incorrect pow result");
    }

    @Test(groups = "special")
    public void testPowInfinity() {
        double pow = calculator.pow(Double.POSITIVE_INFINITY, 1);
        Assert.assertEquals(pow, Double.POSITIVE_INFINITY, "incorrect pow result");
    }

    @Test(groups = "special")
    public void testPowNegInfinity() {
        double pow = calculator.pow(Double.NEGATIVE_INFINITY, 2);
        Assert.assertEquals(pow, Double.POSITIVE_INFINITY, "incorrect pow result");
    }

    @DataProvider(name = "powDataProvider")
    public Object[][] powDataProvider() {
        return new Object[][]{
                {2, 2, 4},
                {3, 2, 9},
                {2, 0, 1},
                {2, 1, 2}
        };
    }
}
