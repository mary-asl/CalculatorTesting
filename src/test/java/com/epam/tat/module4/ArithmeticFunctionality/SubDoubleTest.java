package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseCalculatorTest {
    @Test(dataProvider = "subDataProvider")
    @Parameters({"a", "b", "expected"})
    public void subLongTest(double a, double b, double expected) {
        double sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected, "incorrect sub result");
    }

    @DataProvider(name = "subDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {1, 0.5, 0.5},
                {-1, 0, -1},
                {0, 0, 0},
                {0, 10, -10}
        };
    }
}
