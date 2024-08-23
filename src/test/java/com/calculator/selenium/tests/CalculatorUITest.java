package com.calculator.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorUITest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        try{
        // Set up the ChromeDriver
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER_PATH"));
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/calculator");
        }
        catch(Exception ex){
            System.out.println("Getting error related to chrome driver");
        }
    }
    @Test
    public void testAddition() {
        WebElement input1 = driver.findElement(By.id("input1"));
        WebElement input2 = driver.findElement(By.id("input2"));
        WebElement addButton = driver.findElement(By.id("addButton"));
        WebElement result = driver.findElement(By.id("result"));

        input1.sendKeys("5");
        input2.sendKeys("3");
        addButton.click();

        Assert.assertEquals(result.getText(), "8");
    }

    @Test
    public void testSubtraction() {
        WebElement input1 = driver.findElement(By.id("input1"));
        WebElement input2 = driver.findElement(By.id("input2"));
        WebElement subtractButton = driver.findElement(By.id("subtractButton"));
        WebElement result = driver.findElement(By.id("result"));

        input1.sendKeys("10");
        input2.sendKeys("4");
        subtractButton.click();

        Assert.assertEquals(result.getText(), "6");
    }

    @AfterTest
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
