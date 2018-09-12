@ui @regression
Feature: E2E-LoginOrRegister-User registers and navigates to t&c page, accepts/rejects terms

  Scenario: User registers and navigates from T&C and accepts terms
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "testFN" in "Your first name" field on the "register" page
    And A user enters "testLN" in "Your surname" field on the "register" page
    And A user enters "testing" in "generated email address" field on the "register" page
    And A user enters "Password@1234" in "Set password" field on the "register" page
    And A user enters "Password@1234" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And The screen should display the the following elements:
      | Confirm Details   |
      | Edit your details |
    And A user clicks the "Confirm details" button on the "register" page
    And A user is redirected to the "tandc" page
    And A user clicks the "accept" button on the "tandc" page
    Then A user is redirected to the "register-complete" page


  Scenario: User registers and navigates from T&C and rejects terms
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "testFN" in "Your first name" field on the "register" page
    And A user enters "testLN" in "Your surname" field on the "register" page
    And A user enters "testing" in "generated email address" field on the "register" page
    And A user enters "Password@1234" in "Set password" field on the "register" page
    And A user enters "Password@1234" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And The screen should display the the following elements:
      | Confirm Details   |
      | Edit your details |
    And A user clicks the "Confirm details" button on the "register" page
    And A user is redirected to the "tandc" page
    And A user clicks the "no thanks" button on the "tandc" page
    Then A user is redirected to the "welcome" page


