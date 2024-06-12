package com.selenium.cucumber.stepdef;

import com.selenium.cucumber.BaseTest;
import com.selenium.cucumber.page.CartPage;
import com.selenium.cucumber.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartStepDef extends BaseTest {
    HomePage homePage;
    CartPage cartPage;

    @And("user can add product to cart")
    public void userClickAddToCartButton() {
        driver.findElement(By.cssSelector("button.btn_secondary.btn_inventory"));
        System.out.println("masuk");
//        homePage.addProduct();
    }

    @And("user click cart button on the top right")
    public void userClickCartButtonOnTheTopRight() {
       homePage.clickCartButton();
    }

    @And("now user is on Cart Page")
    public void nowUserIsOnCartPage() {
        cartPage = new CartPage(driver);
        cartPage.validateCartPage();
    }

    @When("user remove product")
    public void userRemoveProduct() {
        cartPage.removeProduct();
    }

    @Then("user can continue shopping by clicking the Continue Shopping button")
    public void userCanContinueShoppingByClickingTheContinueShoppingButton() {
        cartPage.validateCartPage();
    }
}
