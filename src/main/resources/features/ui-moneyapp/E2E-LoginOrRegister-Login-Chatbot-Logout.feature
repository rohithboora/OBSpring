@ui @regression
Feature: E2E-LoginOrRegister-User navigates from Login to chatbot and logs out from chat screen, validate logout confirmation screen

  Scenario: The user logs in bank account and logs out from chat screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      |automationtest@test.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page 
	And A user is redirected to the "settings" page 
	And A user clicks the "logout" button on the "settings" page 
	And The screen should display the following text: "Are you sure you want to log out?" 
	And A user clicks the "yes" button on the "settings" page 
	Then The screen should display the following text: "You're logged out!" 