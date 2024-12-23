Feature: HomePage
  Scenario: HomePage should be displayed
    Given I am on the Browser
    When I navigate to the "https://www.google.com"
    Then I should see the WelcomePage
