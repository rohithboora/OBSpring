Feature: UI - 
#--------------------------Scenario 1---------------------------------------------#
Scenario Outline: Progress Chat with Virtual Assistant
 Given A user access "welcome" section of "everyday banking" application
    When A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
       |test@test12.com | Password@1234 |
    And A user is redirected to the "chatbot" page
	And the correct conversation in arti is progressed [data="<conversation>"]

Examples:
| conversation |
| chatbot_conversation 	|

