package com.epam.tat.module4.TrigonometricFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void CtgTest(double a, double expected) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expected, "incorrect ctg result");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {45, 1},
                {90, 1},
                {0, 0}
        };
    }
}
