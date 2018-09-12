 @ui @needrefactor
Feature: UI-NC1338-As a user, I want to delete my profile created and navigate back and also create user that gets deleted

  Scenario: User gets deleted via delete profile screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@13 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    Then A user is redirected to the "settings" page
    When A user clicks the "myprofile" button on the "settings" page
    Then A user is redirected to the "profile" page
    And A user clicks the "delete" button on the "profile" page
    And A user is redirected to the "delete" page
    And A user clicks the "delete" button on the "delete" page
    Then A user clicks the "deleteprofile" button on the "delete" page

  Scenario: Create a new user by registering
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "testFNS" in "Your first name" field on the "register" page
    And A user enters "testLNS" in "Your surname" field on the "register" page
    And A user enters "a3a@a3.com" in "your email address" field on the "register" page
    And A user enters "Password@1234" in "Set password" field on the "register" page
    And A user enters "Password@1234" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And The screen should display the the following elements:
      | Confirm Details   |
      | Edit your details |
    And A user clicks the "Confirm details" button on the "register" page
    And A user is redirected to the "tandc" page
    And A user clicks the "accept" button on the "tandc" page
    Then A user is redirected to the "register-complete" page

  Scenario: User is on delete details page and clicks delete and cancels it. A user tries to click myprofile in setting screenGiven authenticate with email "a@a.com" and password "123"
    Given authenticate with email "a@a.com" and password "123"
    Given A user access "welcome" section of "everyday banking" application
    When A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "myprofile" button on the "settings" page
    And A user is redirected to the "profile" page
    And A user clicks the "delete" button on the "profile" page
    And A user is redirected to the "delete" page
    And A user clicks the "delete" button on the "delete" page
    And A user clicks the "canceldelete" button on the "delete" page
    Then A user is redirected to the "delete" page

  Scenario: User is on delete details page and clicks back and lands on delete profile screen. A user tries to click myprofile in setting screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    Then A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "myprofile" button on the "settings" page
    And A user is redirected to the "profile" page
    And A user clicks the "delete" button on the "profile" page
    And A user is redirected to the "delete" page
    And A user clicks the "delete" button on the "delete" page
    And A user clicks the "canceldelete" button on the "delete" page
    And A user clicks the "back" button on the "delete" page
    Then A user is redirected to the "profile" page