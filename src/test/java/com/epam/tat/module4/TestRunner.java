package com.epam.tat.module4;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG();
        tng.addListener(tla);

        XmlSuite suite = new XmlSuite();
        suite.setName("Calculator");

        List<String> files = new ArrayList<String>() {{
            add("src/main/resources/calculator.xml");
        }};
        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList();
        suites.add(suite);
        tng.setXmlSuites(suites);

        tng.run();
    }
}
