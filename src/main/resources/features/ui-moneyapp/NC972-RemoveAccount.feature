@ui @regression
Feature: UI-NC972-Confirmation of Removal Account Success

  Scenario: The user navigates account overview, sees remove account button and clicks remove button to validate confirmation screen
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters "testauto@nw.com" in "email" field on the "login" page
    And A user enters "Password@12" in "password" field on the "login" page
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "chatbot" page
    And A user enters "Home" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user clicks the "account overview" button on the "chatbot" page
    And A user is redirected to the "account-overview" page
    And A user should see a "remove account" button on "account-overview" page
    And A user clicks the "remove" button for "Any" account on the "account-overview" page
    And A user clicks the "remove with consent" button on the "account-overview" page
    And A user clicks the "account removed continue" button on the "account-overview" page
    And A user should see account has been "removed" on the "account-overview" page
    And A user clicks the "add" button on the "account-overview" page
    And A user is redirected to the "select-provider" page
    And A user clicks the "nationwide" button on the "select-provider" page
    And A user is redirected to the "data-request" page
    And A user clicks the "Confirm" button on the "data-request" page
    And A user is redirected to the "obac-nbs" page
    And A user clicks the "Success" button on the "obac-nbs" page
    Then A user is redirected to the "chatbot" page

	
	
	
	
	
	