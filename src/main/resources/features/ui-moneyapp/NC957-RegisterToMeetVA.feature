@ui @regression
Feature: UI-NC957-Register user and navigate to meet arti

  Scenario: User clicks register, enters valid details, clicks submit, user is taken to the terms and conditions screen, user clicks Accept T and C button and completes registration
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "Firstname" in "Your first name" field on the "register" page
    And A user enters "Surname" in "Your surname" field on the "register" page
    And A user enters "testing" in "generated email address" field on the "register" page
    And A user enters "Ab@12345" in "Set password" field on the "register" page
    And A user enters "Ab@12345" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And A user clicks the "Confirm details" button on the "register" page
    And A user clicks the "accept" button on the "tandc" page
    And A user is redirected to the "register-complete" page
    And A user clicks the "Meet VA" button on the "thanks" page
    Then A user is redirected to the "chatbot" page