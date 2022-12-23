package dev.juce.automation.selenium.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void helloSelenium(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        String currentUrl = driver.getCurrentUrl();
        String expected = "https://automationexercise.com/";
        Assertions.assertEquals(expected,currentUrl);

        //driver.quit();
    }

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }
}