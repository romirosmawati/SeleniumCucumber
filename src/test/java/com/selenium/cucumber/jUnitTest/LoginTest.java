package com.selenium.cucumber.jUnitTest;

import com.selenium.cucumber.page.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void loginTest() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://www.saucedemo.com/v1/");

        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
    }
}
