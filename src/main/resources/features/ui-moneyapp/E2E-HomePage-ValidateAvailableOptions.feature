@ui @regression
Feature: E2E-Homepage-Validate options

  Scenario: The user navigates to VA chatbot and wants to see the accounts overview
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user enters "Home" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    Then The screen should display the the following elements:
      | Account Overview |
      | Spending         |
      | Move Money       |
      | Budgeting        |
      | Tell Me More     |
    Then A user enters "Account Overview" in "chatinput" field on the "chatbot" page
    When A user clicks the "sendchat" button on the "chatbot" page
    Then A user is redirected to the "account-overview" page
 