package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivLongTest extends BaseCalculatorTest {
    @Test(dependsOnMethods = "testDiv", alwaysRun = true, expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        long div = calculator.div(1, 0);
    }

    @Test(dataProvider = "divDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testDiv(long a, long b, long expected){
        long div = calculator.div(a, b);
        Assert.assertEquals(div, expected, "incorrect div result");
    }

    @DataProvider(name = "divDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {1, 1, 1},
                {0, 1, 0},
                {10, 2, 5}
        };
    }
}
