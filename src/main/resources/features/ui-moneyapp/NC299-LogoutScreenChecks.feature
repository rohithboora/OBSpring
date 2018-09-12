@ui @regression
Feature: UI-NC299-User log outs successfully using button NC-299

  Scenario: A user tries to logout in everyday banking applicaiton
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "logout" button on the "settings" page
    And The screen should display the following text: "Are you sure you want to log out?"
    And A user clicks the "yes" button on the "settings" page
    Then The screen should display the following text: "You're logged out!"


  Scenario: A user tries to cancel logout and stays in everyday banking applicaiton
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "logout" button on the "settings" page
    And The screen should display the following text: "Are you sure you want to log out?"
    And A user clicks the "cancel" button on the "settings" page
    Then A user is redirected to the "settings" page