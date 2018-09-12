@ui
Feature: E2E-LoginOrRegister-Validate error message when unauthorised user tries to Register/Login Journey

  Scenario: Non-registered user tries to log in and capture error message
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | NotWhitelisted@notregistered.com | Password1 |
    Then The screen should display the following text: "Something went wrong"