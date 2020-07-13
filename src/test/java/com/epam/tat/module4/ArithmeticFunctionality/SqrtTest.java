package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends BaseCalculatorTest {
    @Test(dataProvider = "sqrtDataProvider")
    @Parameters({"a", "expected"})
    public void testSqrt(double a, double expected) {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected, "incorrect sqrt result");
    }

    @DataProvider(name = "sqrtDataProvider")
    public Object[][] powDataProvider() {
        return new Object[][]{
                {4, 2},
                {9, 3},
        };
    }
}
