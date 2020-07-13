package com.epam.tat.module4.ArithmeticFunctionality;

import com.epam.tat.module4.BaseCalculatorTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseCalculatorTest {

    @Test(dataProvider = "multDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testMult(double a, double b, double expected){
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected, "incorrect mult result");
    }

    @Test(groups = "special")
    public void testMultInfinity(){
        double mult = calculator.mult(Double.POSITIVE_INFINITY, 0);
        Assert.assertEquals(mult, Double.POSITIVE_INFINITY, "incorrect mult result");
    }

    @Test(groups = "special")
    public void testMultNegInfinity(){
        double mult = calculator.mult(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        Assert.assertEquals(mult, Double.NaN, "incorrect mult result");
    }

    @DataProvider(name = "multDataProvider")
    public Object[][] multDataProvider() {
        return new Object[][]{
                {2, 0.5, 1},
                {0, 3.4, 0},
                {2, 10, 20}
        };
    }
}
