package com.selenium.cucumber.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    private WebDriver driver;
    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By filterButton = By.className("product_sort_container");
    By topProductPrice = By.className("inventory_item_price");
    By secondProductPrice = By.className("inventory_item_price");
    By burgerButton = By.className("bm-burger-button");
    By logoutButton = By.cssSelector("a#logout_sidebar_link");
    Select filterOptions, openMenu;
//    By addProduct = By.className("btn_primary.btn_inventory");
    By cartButton = By.cssSelector("div#shopping_cart_container");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }
    public void clickProductName() {
        driver.findElement(productTitle).click();
    }
    public void clickFilterButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        filterOptions = new Select(driver.findElement(filterButton));
    }
    public void clickPriceLowtoHighButton() {
        filterOptions.selectByVisibleText("Price (low to high)");
    }
    public void clickNameZToAButton() {
        filterOptions.selectByVisibleText("Name (Z to A)");
    }
    public void clickPriceHIghtoLowButton() {
        filterOptions.selectByVisibleText("Price (high to low)");
    }
    public void validatePriceLowtoHigh() {
       String amountFirst = driver.findElement(topProductPrice).getText();
       String valueFirst = amountFirst.substring(1, amountFirst.length());
       double doubleFirst = Double.parseDouble(valueFirst);

        String amountSecond = driver.findElement(secondProductPrice).getText();
        String valueSecond = amountSecond.substring(1, amountSecond.length());
        double doubleSecond = Double.parseDouble(valueSecond);
        boolean result = doubleFirst < doubleSecond;
    }
    public void clickOpenMenu() {
        driver.findElement(burgerButton).click();
    }
    public void clickLogoutButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(logoutButton).click();
    }

    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }
}
