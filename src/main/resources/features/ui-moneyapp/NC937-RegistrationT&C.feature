@uiTest @regression
Feature: UI-NC937-T&Cs for registration page and click no thanks

  Scenario: User clicks register, enters valid details, clicks submit, user is taken to the terms and conditions screen, user clicks no thanks button, user is taken back to welcome page
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "Firstname" in "your first name" field on the "register" page
    And A user enters "Surname" in "Your surname" field on the "register" page
    And A user enters "testing" in "generated email address" field on the "register" page
    And A user enters "Password@1" in "Set password" field on the "register" page
    And A user enters "Password@1" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And A user clicks the "Confirm details" button on the "register" page
    And A user is redirected to the "tandc" page
    And A user clicks the "no thanks" button on the "tandc" page
    Then A user is redirected to the "welcome" page