package org.example;

import org.junit.After;
import org.junit.Before;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void FirstTest (){
        driver.get("https://www.mozilla.org/ru/");
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
