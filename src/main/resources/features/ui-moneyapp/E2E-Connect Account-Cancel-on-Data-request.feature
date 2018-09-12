@ui @regression
Feature: E2E-ConnectAccount-User navigation from Login to Data request screen, click cancel on data request page and lands on connect account

Scenario: The user navigates account overview, sees remove account button and clicks remove button to validate confirmation screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
        | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user enters "Home" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user clicks the "account overview" button on the "chatbot" page
    And A user is redirected to the "account-overview" page
    And A user clicks the "add" button on the "account-overview" page
    And A user is redirected to the "select-provider" page
    And A user clicks the "nationwide" button on the "select-provider" page
    And A user is redirected to the "data-request" page
    And A user clicks the "Cancel" button on the "data-request" page
    Then A user is redirected to the "select-provider" page