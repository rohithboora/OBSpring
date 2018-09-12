Feature: UI - Validates overdraft Queries dialog logic to new intents and entities NC-806

  Scenario Outline: User checks last message for balance queries
    Given A user access "welcome" section of "everyday banking" application
    When A user clicks the "login" button on the "welcome" page
    Then A user is redirected to the "login" page
    When A user enters credentials on page
      | xyz@test.com | Password@1234 |
    Then A user is redirected to the "chatbot" page
    When A user enters "<Input>" and validates "<Response>" for the following inputs:
Examples:
      | Input                               |        Response                                               |
      | Are any of my accounts overdrawn           |Your nationwide account ending in 3348 has a balance of -£45.60 |
      |What is my overdraft balance?               |Your nationwide account ending in 3348 has a balance of -£45.60 |
      |Am I in my overdraft?                       |Your nationwide account ending in 3348 has a balance of -£45.60 |
      |Is my nationwide account overdrawn          |Your nationwide account ending in 3348 has a balance of -£45.60 |
      |Am I in my nationwide in my redbank account |Your nationwide account ending in 3348 has a balance of -£45.60 |
      |Overdraft                                   |Your nationwide account ending in 3348 has a balance of -£45.60 |
