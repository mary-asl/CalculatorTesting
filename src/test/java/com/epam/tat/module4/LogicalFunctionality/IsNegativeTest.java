package com.epam.tat.module4.LogicalFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseCalculatorTest {
    @Test(dataProvider = "DataProvider")
    @Parameters({"a", "expected"})
    public void isNegativeTest(long a, boolean expected) {
       boolean result = calculator.isNegative(a);
        Assert.assertEquals(result, expected, "incorrect result - it's positive number");
    }

    @DataProvider(name = "DataProvider")
    public Object[][] DataProvider() {
        return new Object[][]{
                {1, false},
                {0, false},
                {-244, true}
        };
    }
}
