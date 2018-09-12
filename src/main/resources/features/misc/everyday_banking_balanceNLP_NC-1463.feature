Feature: UI - Validates balance Queries dialog logic to new intents and entities NC-1463

  Scenario Outline: User checks last message for balance queries
    Given A user access "welcome" section of "everyday banking" application
    When A user clicks the "login" button on the "welcome" page
    Then A user is redirected to the "login" page
    When A user enters credentials on page
      | nc947@test.com | password1234 |
    Then A user is redirected to the "chatbot" page
    When A user enters "<Input>" and validates "<Response>" for the following inputs:
    Examples:
      | Input                               |        Response                                               |
      | Give me my balance                  |Your nationwide account ending in 3348 has a balance of £45.60 |
      |How much money have I got            |Your nationwide account ending in 3348 has a balance of £45.60 |
      |How much money have I got            |Your nationwide account ending in 3348 has a balance of £45.60 |
      |What is my balance                    |Your nationwide account ending in 3348 has a balance of £45.60 |
      |Balance                               |Your nationwide account ending in 3348 has a balance of £45.60 |
      |Give me my nationwide balance         |Your nationwide account ending in 3348 has a balance of £45.60 |
      |How much is in the nationwide account |Your nationwide account ending in 3348 has a balance of £45.60 |
      |How much money do I have in nationwide|Your nationwide account ending in 3348 has a balance of £45.60|
      |What is my nationwide balance         |Your nationwide account ending in 3348 has a balance of £45.60|
      |Balance nationwide                   |Your nationwide account ending in 3348 has a balance of £45.60  |
