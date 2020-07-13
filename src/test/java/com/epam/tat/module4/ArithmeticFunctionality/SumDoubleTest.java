package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalculatorTest {
    @Test(groups = "main", dataProvider = "sumDataProvider")
    @Parameters({"a", "b", "expected"})
    public void sumLongTest(double a, double b, double expected) {
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected, "incorrect summation result");
    }

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 1, 2},
                {0, 0, 0},
                {0, 10, 10}
        };
    }
}
