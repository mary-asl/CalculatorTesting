package com.epam.tat.module4.LogicalFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void isPositiveTest(long a, boolean expected) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expected, "incorrect result - it's negative number");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {1, true},
                {0, false},
                {-244, false}
        };
    }
}
