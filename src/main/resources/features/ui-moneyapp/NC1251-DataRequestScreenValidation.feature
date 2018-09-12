@ui @regression
Feature: UI-NC1251-Validate labels on Data request screen

  Scenario: The user navigates account overview, sees remove account button and clicks remove button to validate confirmation screen
    Given authenticate with email "a@a.com" and password "123"
    Then A user access "welcome" section of "everyday banking" application
    When A user clicks the "login" button on the "welcome" page
    Then A user is redirected to the "login" page
    When A user enters credentials on page
      | testauto@nw.com | Password@12 |
    Then A user is redirected to the "chatbot" page
    And A user enters "Home" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user clicks the "account overview" button on the "chatbot" page
    And A user is redirected to the "account-overview" page
    And A user clicks the "add" button on the "account-overview" page
    Then A user is redirected to the "select-provider" page
    When A user clicks the "nationwide" button on the "select-provider" page
    Then A user is redirected to the "data-request" page
    Then The screen should display the the following elements:
      | Data request                                     |
      | Your Account Details                             |
      | Your Account Transactions for the last 12 months |
      | Your Account Features and Benefits               |
      | Your Regular Payments                            |
      | CONFIRM                                          |
      | CANCEL                                           |
    And A user clicks the "Cancel" button on the "data-request" page
    Then A user is redirected to the "select-provider" page
	