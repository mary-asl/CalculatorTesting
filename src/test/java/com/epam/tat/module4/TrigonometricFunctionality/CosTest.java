package com.epam.tat.module4.TrigonometricFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void CosTest(double a, double expected) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expected, "incorrect cos result");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {360, 1},
                {60, 0.5},
                {0, 1}
        };
    }
}
