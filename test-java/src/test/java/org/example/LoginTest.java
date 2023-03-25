package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void TestLogin() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("sta");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.name("login")).click();

    }
    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
