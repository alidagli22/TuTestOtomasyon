package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before() {
        DriverFactory.initializeDriver();
    }

    @After
    public void after() {
        DriverFactory.quitDriver();
    }

}
