Feature: UI - Validates first and last message

Scenario: User registers and checks first message
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| nc972@test.com | Password12 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Account Overview" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the first message as text: "Good to see you again test. So I can help you manage your money better you need to aggregate your accounts, Which account would you like to add now?"
