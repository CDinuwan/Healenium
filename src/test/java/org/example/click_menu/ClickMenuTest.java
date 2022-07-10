package org.example.click_menu;

import org.example.base.healTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickMenuTest extends healTest {

    By menuButton = By.xpath("//span[@class='navbar__tutorial-menu--menu-bars']");

    @Test
    private void clickMenuTest() {
        driver.findElement(menuButton).click();
    }
}

