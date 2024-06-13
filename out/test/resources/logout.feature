@logout
Feature: Logout

  Scenario: Logout
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user click triple line button on left top
    When user click logout
    Then user is on login page