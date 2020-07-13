package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseCalculatorTest {
    @Test(dependsOnMethods = "testDiv", alwaysRun = true, expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        long div = calculator.div(1, 0);
    }

    @Test(dataProvider = "divDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testDiv(double a, double b, double expected){
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected, "incorrect div result");
    }

    @DataProvider(name = "divDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {2, 0.5, 4},
                {0, 3.4, 0},
                {2, 10, 0.2}
        };
    }
}
