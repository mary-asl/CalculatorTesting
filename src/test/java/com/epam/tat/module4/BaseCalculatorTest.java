package com.epam.tat.module4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class BaseCalculatorTest {

    protected Calculator calculator;

    @BeforeClass
    public void initCalculator() {
        calculator = new Calculator();
    }

    @BeforeGroups(value = {"main"})
    public void beforeGroup(){
        System.out.println("Before main group");
    }
}
