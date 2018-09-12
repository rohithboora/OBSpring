@ui @regression
Feature: UI-NC981-Verifies "Already Registered" link on register page navigates to login screen

  Scenario: Click "Already Registered" link on register page and it navigates to login screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user clicks the "already registered" button on the "register" page
    Then A user is redirected to the "login" page