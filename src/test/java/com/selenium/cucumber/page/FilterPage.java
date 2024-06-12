package com.selenium.cucumber.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterPage {
    WebDriver driver;

    By filterButton = By.xpath("//*[@id=\"inventory_filter_container\"]/select");
    By filterPriceLowtoHigh = By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[3]");
    By topProductPrice = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/div/text()[2]");
    By secondProductPrice = By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/div/text()[2]");

    public FilterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFilterButton() {
        driver.findElement(filterButton).isSelected();
    }
    public void clickPriceLowtoHighButton() {
        driver.findElement(filterPriceLowtoHigh).isSelected();
    }
    public void validatePriceLowtoHigh() {
        int firstPrice = Integer.parseInt(driver.findElement(topProductPrice).getText());
        int secondPrice = Integer.parseInt(driver.findElement(secondProductPrice).getText());
        boolean result = firstPrice < secondPrice;
    }

}

