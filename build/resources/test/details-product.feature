@details-product
Feature: Details Product

    @details-product
    Scenario: Details product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    When user click product name
    Then user is on product page