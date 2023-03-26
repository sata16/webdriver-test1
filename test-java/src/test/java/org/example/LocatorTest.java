package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;



public class LocatorTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
     boolean isElementPresent(By by)
    {
        try{
            driver.findElement(by);
            return true;
        }
        catch(NoSuchElementException ex){
            return false;
        }
    }
    @Test
    public void LocatorTest() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//*[.='Appearence']")).click();
        assertTrue(isElementPresent(By.tagName("h1")));
        driver.findElement(By.id("doc-template")).click();
        assertTrue(isElementPresent(By.tagName("h1")));
        driver.findElement(By.id("doc-logotype")).click();
        assertTrue(isElementPresent(By.tagName("h1")));
        driver.findElement(By.xpath("//*[.='Catalog']")).click();
        driver.findElement(By.id("doc-catalog")).click();
        driver.findElement(By.id("doc-product_groups")).click();
        driver.findElement(By.id("doc-option_groups")).click();
        driver.findElement(By.id("doc-manufacturers")).click();
        driver.findElement(By.id("doc-suppliers")).click();
        driver.findElement(By.id("doc-delivery_statuses")).click();

        driver.findElement(By.id("doc-sold_out_statuses")).click();
        driver.findElement(By.id("doc-quantity_units")).click();
        driver.findElement(By.id("doc-csv")).click();
        driver.findElement(By.xpath("//*[.='Countries']")).click();
        driver.findElement(By.xpath("//*[.='Currencies']")).click();
        driver.findElement(By.xpath("//*[.='Customers']")).click();
        driver.findElement(By.id("doc-customers")).click();
        driver.findElement(By.id("doc-csv")).click();
        driver.findElement(By.id("doc-newsletter")).click();
        driver.findElement(By.xpath("//*[.='Geo Zones']")).click();
        driver.findElement(By.xpath("//*[.='Languages']")).click();
        driver.findElement(By.id("doc-languages")).click();
        driver.findElement(By.id("doc-storage_encoding")).click();
        driver.findElement(By.xpath("//*[.='Modules']")).click();
        driver.findElement(By.id("doc-jobs")).click();
        driver.findElement(By.id("doc-customer")).click();
        driver.findElement(By.id("doc-shipping")).click();
        driver.findElement(By.id("doc-payment")).click();
        driver.findElement(By.id("doc-order_total")).click();
        driver.findElement(By.id("doc-order_success")).click();
        driver.findElement(By.id("doc-order_action")).click();
        driver.findElement(By.xpath("//*[.='Orders']")).click();
        driver.findElement(By.id("doc-orders")).click();
        driver.findElement(By.id("doc-order_statuses")).click();
        driver.findElement(By.xpath("//*[.='Pages']")).click();
        driver.findElement(By.xpath("//*[.='Reports']")).click();
        driver.findElement(By.id("doc-monthly_sales")).click();
        driver.findElement(By.id("doc-most_sold_products")).click();
        driver.findElement(By.id("doc-most_shopping_customers")).click();
        driver.findElement(By.xpath("//*[.='Settings']")).click();
        driver.findElement(By.id("doc-store_info")).click();
        driver.findElement(By.id("doc-defaults")).click();
        driver.findElement(By.id("doc-general")).click();
        driver.findElement(By.id("doc-listings")).click();
        driver.findElement(By.id("doc-images")).click();
        driver.findElement(By.id("doc-checkout")).click();
        driver.findElement(By.id("doc-advanced")).click();
        driver.findElement(By.id("doc-security")).click();
        driver.findElement(By.xpath("//*[.='Slides']")).click();
        driver.findElement(By.xpath("//*[.='Tax']")).click();
        driver.findElement(By.id("doc-tax_classes")).click();
        driver.findElement(By.id("doc-tax_rates")).click();
        driver.findElement(By.xpath("//*[.='Translations']")).click();
        driver.findElement(By.id("doc-search")).click();
        driver.findElement(By.id("doc-scan")).click();
        driver.findElement(By.id("doc-csv")).click();
        driver.findElement(By.xpath("//*[.='Users']")).click();
        driver.findElement(By.xpath("//*[.='vQmods']")).click();

    }



    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
