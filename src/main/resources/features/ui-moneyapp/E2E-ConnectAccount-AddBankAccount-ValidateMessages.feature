@ui @regression
Feature: E2E-ConnectAccount-User navigates to connect accounts adds NBS bank account, validate chatbot success/error responses

  Scenario: The user navigates chatbot after successfully adding bank accounts
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
    And A user should see a "remove account" button on "account-overview" page
    And A user clicks the "remove" button for "Any" account on the "account-overview" page
    And A user clicks the "remove with consent" button on the "account-overview" page
    And A user clicks the "account removed continue" button on the "account-overview" page
    And A user should see account has been "removed" on the "account-overview" page
    And A user clicks the "add" button on the "account-overview" page
    And A user is redirected to the "select-provider" page
    And A user clicks the "nationwide" button on the "select-provider" page
    And A user is redirected to the "data-request" page
    And A user clicks the "Confirm" button on the "data-request" page
    And A user is redirected to the "obac-nbs" page
    And A user clicks the "Success" button on the "obac-nbs" page
    And A user is redirected to the "chatbot" page
    Then The screen should display the last message as text: "Great! You have"


  Scenario: The user navigates chatbot and gets error message on adding bank accounts
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
    And A user clicks the "Confirm" button on the "data-request" page
    And A user is redirected to the "obac-nbs" page
    And A user clicks the "Error" button on the "obac-nbs" page
    And A user is redirected to the "chatbot" page
    Then The screen should display the last message as text: "It looks like something"
