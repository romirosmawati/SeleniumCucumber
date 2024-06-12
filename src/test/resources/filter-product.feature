@filter-product
Feature: Filter Product

  @filter-price-low-to-high
  Scenario: Filter Price (low to high)
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user click filter button
    When select Price low to high
    Then list products in order from cheapest to highest product price

  @filter-name-z-to-a
  Scenario: Filter Name (Z to A)
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user click filter button
    When select name Z to A
    Then list products in order from cheapest to highest product price

  @filter-price-high-to-low
  Scenario: Filter Price (high to low)
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user click filter button
    When select price high to low
    Then list products in order from cheapest to highest product price