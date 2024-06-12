package com.selenium.cucumber.stepdef;

import com.selenium.cucumber.BaseTest;
import com.selenium.cucumber.page.DetailsProductPage;
import com.selenium.cucumber.page.HomePage;
import io.cucumber.java.en.And;

public class DetailsProductStepDef extends BaseTest {
    DetailsProductPage detailsProductPage;

    @And("user is on product page")
    public void userIsOnProductPage() {
        detailsProductPage = new DetailsProductPage(driver);
        detailsProductPage.validateDetailsProductPage();
        System.out.println("sama");
    }
}
