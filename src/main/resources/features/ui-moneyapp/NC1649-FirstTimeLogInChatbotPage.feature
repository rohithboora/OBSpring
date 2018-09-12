@ui @needtofix
Feature: UI-NC1649-User without any connected accounts First Time Login and Subsequent Login Arti Greetings

  Scenario: Users first interaction with Arti after registration (without any connected accounts)
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And A user enters "testFN" in "Your first name" field on the "register" page
    And A user enters "testLN" in "Your surname" field on the "register" page
    And A user enters "testing" in "generated email address" field on the "register" page
    And A user enters "Password@1234" in "Set password" field on the "register" page
    And A user enters "Password@1234" in "Confirm your password" field on the "register" page
    And A user clicks the "Next" button on the "register" page
    And A user clicks the "Confirm details" button on the "register" page
    And A user is redirected to the "tandc" page
    And A user clicks the "accept" button on the "tandc" page
    And A user is redirected to the "thanks" page
    And A user clicks the "meet va" button on the "thanks" page
    And A user is redirected to the "chatbot" page
    And A user checks last "3" agent messages
      | Hi testFN, I'm Arti. I'm here to help you manage your money.                                               |
      | You'll just need to add any current accounts you'd like to see here. That way they'll all be in one place. |
      | If you’d like to know more, type ‘Help’ to find out what I can do.                                         |
    And A user clicks the "add your account" button on the "chatbot" page
    Then A user is redirected to the "select-provider" page

  Scenario: Users Subsequent interaction with Arti after log in (without any connected accounts)
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user checks last "3" agent messages
      | Welcome back testauto.                                                                                                   |
      | Don't forget, you'll need to add your accounts so I can help you manage your money. Would you like to add one now? |
      | If you’d like to know more, type ‘Help’ to find out what I can do.                                                 |
    And A user clicks the "add your account" button on the "chatbot" page
    Then A user is redirected to the "select-provider" page
    