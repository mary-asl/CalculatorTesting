package com.epam.tat.module4.TrigonometricFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SinTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void SinTest(double a, double expected) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expected, "incorrect sin result");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {90, 0.8939966636},
                {30, -0.9880316240928618},
                {0, 0}
        };
    }
}
