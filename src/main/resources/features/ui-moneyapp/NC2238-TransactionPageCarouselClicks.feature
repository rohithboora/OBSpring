@ui @regression @NC-3004
Feature: UI-2238-Validate carousel items on transactions page

  Scenario: Navigate to transactions page and validate all items clicks on carousal
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user enters "Transactions" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user is redirected to the "transactions" page
    And A user clicks the "currentmonth" button on the "transactions" page
    And A user clicks the "eatingout" button on the "transactions" page
    And A user clicks the "mortgagerent" button on the "transactions" page
    And A user clicks the "household" button on the "transactions" page
    And A user clicks the "shopping" button on the "transactions" page
    And A user clicks the "travel" button on the "transactions" page
    And A user clicks the "groceries" button on the "transactions" page
    And A user clicks the "creditloans" button on the "transactions" page
    And A user clicks the "income" button on the "transactions" page
    Then A user clicks the "others" button on the "transactions" page

