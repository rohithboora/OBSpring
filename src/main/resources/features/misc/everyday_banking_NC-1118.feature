Feature: Login user after registration NC1118

#Scenario:
#User registers and checks welcome message
#	Given A user access "welcome" section of "everyday banking" application 
#	When A user clicks the "register" button on the "welcome" page 
#	Then A user is redirected to the "register" page 
#	Then A user enters "Firstname" in "Your first name" field on the "register" page 
#	Then A user enters "Surname" in "Your surname" field on the "register" page 
#	Then A user enters "z3@z3.com" in "Your email address" field on the "register" page 
#	Then A user enters "ABC12345" in "Set password" field on the "register" page 
#	Then A user enters "ABC12345" in "Confirm your password" field on the "register" page 
#	When A user clicks the "Submit Registration" button on the "register" page 
#	When A user clicks the "accept" button on the "tandc" page 
#	Then A user is redirected to the "thanks" page 
#	When A user clicks the "Meet VA" button on the "thanks" page 
#	Then A user is redirected to the "chatbot" page 
#	Then The screen should display the following text: "welcome message"
	

Scenario:
Already registered user logs in and checks welcome message
	Given A user access "welcome" section of "everyday banking" application 
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| nc1118@test.com|Password1 |
	Then A user is redirected to the "chatbot" page 
	Then The screen should display the following text: "welcome message"	