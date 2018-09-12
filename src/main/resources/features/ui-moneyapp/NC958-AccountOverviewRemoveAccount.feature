@ui @regression
Feature: UI-NC958-Validate to see if remove account button is available on account-overview page

  Scenario: The user navigates account overview and wants and sees remove account button
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user enters "Account Overview" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user is redirected to the "account-overview" page
    Then A user should see a "remove account" button on "account-overview" page