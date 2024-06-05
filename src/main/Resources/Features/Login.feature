Feature: Login Feature

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters "admin" and "password"
    And User clicks on login button
    Then User is navigated to the home page