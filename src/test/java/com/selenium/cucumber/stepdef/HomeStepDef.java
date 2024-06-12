package com.selenium.cucumber.stepdef;

import com.selenium.cucumber.BaseTest;
import com.selenium.cucumber.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef extends BaseTest {
    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @And("user click product name")
    public void userClickProductName() {
        homePage.clickProductName();
    }
    @And("user click filter button")
    public void userClickFilter() {
        homePage.clickFilterButton();;
    }

    @When("select Price low to high")
    public void selectPriceLowToHigh() {
        homePage.clickPriceLowtoHighButton();;
    }

    @Then("list products in order from cheapest to highest product price")
    public void listProductsInOrderFromCheapestToHighestProductPrice() {
        homePage.validatePriceLowtoHigh();
    }

    @And("user click triple line button on left top")
    public void userClickTripleLineButtonOnLeftTop() {
        homePage.clickOpenMenu();
    }

    @When("user click logout")
    public void userClickLogout() {
        homePage.clickLogoutButton();
    }

    @When("select name Z to A")
    public void selectNameAToZ() {
        homePage.clickNameZToAButton();
    }

    @When("select price high to low")
    public void selectPriceHighToLow() {
        homePage.clickPriceHIghtoLowButton();
    }
}
