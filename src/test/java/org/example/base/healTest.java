package org.example.base;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;

public class healTest {
    static protected SelfHealingDriver driver ;

    @Test
    public void demoTest() {

        String baseUrl = "https://www.toolsqa.com/";

        driver.get(baseUrl);
        System.out.println("Launching Google Chrome browser");
        String testTitle = "Tools QA";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);
    }

    @BeforeTest
    public void beforeMethod() {
        System.out.println("Starting Test On Chrome Browser");
        WebDriverManager.chromedriver().setup();
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
    }
}