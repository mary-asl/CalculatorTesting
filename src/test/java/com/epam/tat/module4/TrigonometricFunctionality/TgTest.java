package com.epam.tat.module4.TrigonometricFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TgTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void TgTest(double a, double expected) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expected, "incorrect tg result");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {45, 1},
                {0, 0}
        };
    }
}
