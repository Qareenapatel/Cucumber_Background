Feature: Check homepage functionality

  Background: user is logged in
    Given user is on login page
    When user enters usename and password on login page
    And clicks on login button on page
    Then user is navigated to the homepage

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link displayed
    Then close the browser

  Scenario: verify quick launch toolbar is present
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
    Then close the browser
