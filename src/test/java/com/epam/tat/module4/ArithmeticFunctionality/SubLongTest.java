package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubLongTest extends BaseCalculatorTest {

    @Test(groups = "main", dataProvider = "subDataProvider")
    @Parameters({"a", "b", "expected"})
    public void subLongTest(long a, long b, long expected) {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected, "incorrect sub result");
    }

    @DataProvider(name = "subDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {1, 1, 0},
                {0, 0, 0},
                {0, 10, -10}
        };
    }
}
