package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class MultLongTest extends BaseCalculatorTest {
    @Test(dataProvider = "multDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testMult(long a, long b, long expected){
        long mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, "incorrect mult result");
    }

    @DataProvider(name = "multDataProvider")
    public Object[][] multDataProvider() {
        return new Object[][]{
                {2, 5, 10},
                {0, 0, 0},
                {2, 1000, 2000}
        };
    }
}
