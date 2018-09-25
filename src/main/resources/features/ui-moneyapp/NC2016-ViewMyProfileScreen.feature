@ui @regression
Feature: UI-NC2016-view my profile Screen Validation

  Scenario: A user tries to click myprofile in setting  screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "myprofile" button on the "settings" page
    Then A user is redirected to the "profile" page


  Scenario: A user tries to click back in myrpofile page screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "myprofile" button on the "settings" page
    And A user is redirected to the "profile" page
    Then A user clicks the "back" button on the "settings" page


  Scenario: A user tries to click myprofile in setting  screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "myprofile" button on the "settings" page
    And A user is redirected to the "profile" page
    And The screen should display the the following elements:
      | firstname |
      | surname   |
      | email     |