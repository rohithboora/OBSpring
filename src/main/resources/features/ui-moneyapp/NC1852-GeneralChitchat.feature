@ui @regression
Feature: General Chit Chat Intents & Responses

#--------------------------Scenario 1---------------------------------------------#
  Scenario Outline: User asks general chit chat to arti
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    Then the correct conversation for "chit chat" in arti is progressed checking "1" agent messages [data="<conversation>"]

    Examples:
      | conversation           |
      | NC1852-GeneralChitChat |