@ui @regression
Feature: UI-NC1231-As a user, I want to edit my profile via setting


  Scenario: User is on edit profile page and edits and saves via save button
  A user tries to click myprofile in setting  screen
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
    And A user clicks the "edit" button on the "profile" page
    And A user is redirected to the "profile" page
    And A user enters "testauto" in "Change your first name" field on the "profile" page
    And A user enters "testauto" in "Change your surname" field on the "profile" page
    And A user enters "testauto@nw.com" in "Change your email address" field on the "profile" page
    And A user clicks the "savelink" button on the "profile" page
    Then A user clicks the "continue" button on the "profile" page


  Scenario:  User is on edit profile page and edits and cancels it via cancel button
  A user tries to click myprofile in setting  screen
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
    And A user clicks the "edit" button on the "profile" page
    And A user is redirected to the "profile" page
    And A user enters "testauto" in "Change your first name" field on the "profile" page
    And A user enters "testauto" in "Change your surname" field on the "profile" page
    And A user enters "testauto@nw.com" in "Change your email address" field on the "profile" page
    Then A user clicks the "cancel" button on the "profile" page


  Scenario:  User is on chatpage check his name
  A user tries to click myprofile in setting  screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user checks last "2" agent messages
      | Welcome back testauto.                                                    |
      | Would you like to add any other accounts now, or type 'Home' or 'Help' to see what I can do? |

