@ui @regression
Feature: UI-NC1990-As a user, I want to view and remove consent via setting


  Scenario: a user with Remove and cancels the remove consent
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "importantInfo" button on the "settings" page
    And A user is redirected to the "importantInfo" page
    And A user clicks the "consent" button on the "importantInfo" page
    And A user is redirected to the "consent" page
    And A user clicks the "remove" button for "Any" account on the "consent" page
    Then A user clicks the "cancel" button on the "consent" page

  Scenario: a user with account must display only link
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "importantInfo" button on the "settings" page
    And A user is redirected to the "importantInfo" page
    And A user clicks the "consent" button on the "importantInfo" page
    And A user is redirected to the "consent" page
    Then A user clicks the "remove" button for "Any" account on the "consent" page

  Scenario: a user with no account must display only link
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testautomationnoaccount@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "importantInfo" button on the "settings" page
    And A user is redirected to the "importantInfo" page
    And A user clicks the "consent" button on the "importantInfo" page
    And A user is redirected to the "consent" page
    Then The screen should display the the following elements:
      | You have no added accounts |


  Scenario: A user with account navigates to view consent and clicks back
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "importantInfo" button on the "settings" page
    And A user is redirected to the "importantInfo" page
    And A user clicks the "consent" button on the "importantInfo" page
    And A user is redirected to the "consent" page
    And A user clicks the "viewConsent" button on the "consent" page
    And A user is redirected to the "view-consented-data" page
    And A user clicks the "back" button on the "view-consent-data" page
    Then A user is redirected to the "consent" page
	

	
	