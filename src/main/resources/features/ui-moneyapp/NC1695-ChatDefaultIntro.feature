@ui @regression
Feature: UI - NC-1695 A chat default intro (accounts connected)

  Background: A User connects an account
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
    And A user clicks the "Success" button on the "obac-nbs" page
    And A user is redirected to the "chatbot" page

  Scenario: After connecting an account user is presented with  BUTTIONs:‘Add your accounts’,‘Overview of your accounts’,‘Transactions’
    Then The screen should display the last message as text: "Great! You have now connected your account. Please note, it may take a while for all your information to load. Would you like to add any other accounts now, or type 'Home' or 'Help' to see what I can do?"
    And A user checks last "1" agent button
      | Add your accounts |
    And A user clicks the "Add your accounts" button on the "chatbot" page
    And A user is redirected to the "select-provider" page
    And A user clicks the "back" button on the "select-provider" page
    And A user is redirected to the "chatbot" page
    And A user enters "Home" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user checks last "3" agent button
      | Add your accounts         |
      | Overview of your accounts |
      | Transactions              |
    And A user enters "Help" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    Then A user checks last "1" agent messages
      | I can answer questions about your money like...\n'What's my balance?'\n'Am I overdrawn?'\n'How much have I spent?' |
