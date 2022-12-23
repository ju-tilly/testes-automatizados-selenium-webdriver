package dev.juce.automation.selenium.examples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private ChromeDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
    }

    @AfterEach
    void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    void test() {
        WebElement emailAddressElement = driver.findElement(By.name("email")); //encontrar o elemento name email
        emailAddressElement.sendKeys("juces838@gmail.com"); //enviar o email

        WebElement passwordElement = driver.findElement(By.name("password")); //encontrar o elemento name password
        passwordElement.sendKeys("1a6s7d9f"); //enviando a password

        WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")); //encontrar o botão através da patch
        submitBtnElement.click(); //clicar no botão

        WebElement tagPageHome = driver.findElement(By.tagName("h1")); //encontrar tagname h1
        String textTagH1 = tagPageHome.getText();//retorna o texto h1

        Assertions.assertTrue(textTagH1.equals("AutomationExercise")); //comparar se o texto é o mesmo
    }
}
