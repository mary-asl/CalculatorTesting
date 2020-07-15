package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubLongTest extends BaseCalculatorTest {

    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "StringDataProvider")
    public SubLongTest(String a, String b, String expected) {
        this.a = Long.parseLong(a);
        this.b = Long.parseLong(b);
        this.expected = Long.parseLong(expected);
    }

    @Factory(dataProvider = "LongDataProvider")
    public SubLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(groups = "main")
    public void subLongTest() {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected, "incorrect summation result");
    }

    @DataProvider(name = "StringDataProvider")
    public static Object[][] StringDataProvider() {
        return new Object[][]{
                {"10", "1", "9"},
                {"0", "0", "0"},
                {"-10", "-10", "0"},
                {"0", "10", "-10"},
                {"-10", "10", "-20"}
        };
    }

    @DataProvider(name = "LongDataProvider")
    public static Object[][] LongDataProvider() {
        return new Object[][]{
                {10, 1, 9},
                {0, 0, 0},
                {-10, -10, 0},
                {0, 10, -10},
                {-10, 10, -20}
        };
    }
}
