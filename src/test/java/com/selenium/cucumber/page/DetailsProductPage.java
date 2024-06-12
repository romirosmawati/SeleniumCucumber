package com.selenium.cucumber.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class DetailsProductPage {
    WebDriver driver;

    By backButton = By.xpath("//*[@id=\"inventory_item_container\"]");
    By detailsProductName = By.className("inventory_details_desc");

    public DetailsProductPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void backToHome() {
        driver.findElement(backButton).click();
    }

    public void validateDetailsProductPage() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("sama");
//        assertTrue(detailsProduct.isDisplayed()););
//        String detailsProduct = driver.findElement(detailsProductName).getText();
//        assertTrue(detailsProduct.isDisplayed());
//        assertNotNull("Sauce Labs Backpack", detailsProduct);
    }
}
