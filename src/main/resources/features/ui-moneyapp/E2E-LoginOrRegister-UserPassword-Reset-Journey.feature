@ui @regression
Feature: E2E-LoginOrRegister-User clicks on forgot password and resets

Scenario: As a user I want to reset my password and I click forget my password and reset
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user clicks the "forgotten password" button on the "login" page
    And A user is redirected to the "reset-password" page
    And A user enters "iamnotinthecollection" in "email" field on the "reset-password" page
    And A user clicks the "reset password" button on the "reset-password" page
    And A user should see the "error" message "Something is not right. Please try again." on the page
    And A user enters "test2@test.com" in "email" field on the "reset-password" page
    And A user clicks the "reset password" button on the "reset-password" page
    And A user clicks the "home" button on the "thanks" page
    Then A user is redirected to the "welcome" page


