package com.selenium.cucumber.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage {

    private WebDriver driver;
    By cartPageTitle = By.className("subheader");
    By removeProduct = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateCartPage() {
        String title = driver.findElement(cartPageTitle).getText();
        assertEquals("Your Cart", title);
    }

    public void removeProduct() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(removeProduct).click();
    }
}
