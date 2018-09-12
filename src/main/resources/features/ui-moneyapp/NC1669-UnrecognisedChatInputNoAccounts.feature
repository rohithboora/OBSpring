@ui @regression
Feature: UI - Unrecognised Chat Inputs with no connected accounts 

#--------------------------Scenario 1---------------------------------------------#
  Scenario Outline: User is able to correct Chat mistakes when unrecognised inputs are entered
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testautomationnoaccount@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    Then the correct conversation for "no-account" in arti is progressed checking "2" agent messages [data="<conversation>"]
	
	#---Below input the JSON file that you wish to run against the chatbot----#
    Examples:
      | conversation                              |
      | unrecognised_Inputs_no_connected_accounts |