@ignore
Feature: User registeration-delete information NC-976

Background:
Given a request to "toggleWhitelist" api on service "everyday banking"
	When the "get" request is sent 
	Then the status code will be "200" 
	And the "whitelistFunctionality" "payload" parameter is "false"
Given A user access "welcome" section of "everyday banking" application 
	When A user clicks the "register" button on the "welcome" page 
	Then A user is redirected to the "register" page 


Scenario:
User registers and navigates from T&C and closes browser
	Then A user enters "aarthI222" in "Your first name" field on the "register" page 
	Then A user enters "gk1" in "Your surname" field on the "register" page 
	Then A user enters "testing" in "Your email address" field on the "register" page 
	Then A user enters "password1234" in "Set password" field on the "register" page 
	Then A user enters "password1234" in "Confirm your password" field on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	Then The screen should display the the following elements: 
		| Confirm Details        |
		| Edit your details      |
	When A user clicks the "Confirm details" button on the "register" page
	Then A user is redirected to the "tandc" page 
	Then The screen should display the the following elements: 
		| back 	       |
		| no thanks    |
		| accept 	   |
	#Then A user closes browser



Scenario:
User registers and navigates from T&C to confirm details page to register screen to main welcome screen
	Then A user enters "aarthI222" in "Your first name" field on the "register" page 
	Then A user enters "gk1" in "Your surname" field on the "register" page 
	Then A user enters "testing" in "Your email address" field on the "register" page 
	Then A user enters "password1234" in "Set password" field on the "register" page 
	Then A user enters "password1234" in "Confirm your password" field on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	Then The screen should display the the following elements: 
		| Confirm Details        |
		| Edit your details      |
	When A user clicks the "Confirm details" button on the "register" page
	Then A user is redirected to the "tandc" page 
	When A user clicks the "back" button on the "tandc" page 
	Then A user should see the "Firstname" field highlighted in "blue" on the "register" page
	Then A user should see the "Surname" field highlighted in "blue" on the "register" page
	Then A user should see the "email" field highlighted in "blue" on the "register" page
	Then A user should see the "set password" field highlighted in "blue" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "blue" on the "register" page
	When A user clicks the "back" button on the "register" page 
	Then A user enters "ABC123457" in "Set password" field on the "register" page 
	Then A user enters "ABC123457" in "Confirm your password" field on the "register" page 
	When A user clicks the "register back" button on the "register" page
	Then A user is redirected to the "welcome" page



Scenario:
User registers and navigates from T&C to confirm details page to register screen to main welcome screen
	Then A user enters "aarthI222" in "Your first name" field on the "register" page 
	Then A user enters "gk1" in "Your surname" field on the "register" page 
	Then A user enters "testing" in "Your email address" field on the "register" page 
	Then A user enters "password1234" in "Set password" field on the "register" page 
	Then A user enters "password1234" in "Confirm your password" field on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	Then The screen should display the the following elements: 
		| Confirm Details        |
		| Edit your details      |
	When A user clicks the "Confirm details" button on the "register" page
	Then A user is redirected to the "tandc" page 
	When A user clicks the "back" button on the "tandc" page 
	Then A user should see the "Firstname" field highlighted in "blue" on the "register" page
	Then A user should see the "Surname" field highlighted in "blue" on the "register" page
	Then A user should see the "email" field highlighted in "blue" on the "register" page
	Then A user should see the "set password" field highlighted in "blue" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "blue" on the "register" page
	When A user clicks the "back" button on the "register" page 
	Then A user enters "ABC123457" in "Set password" field on the "register" page 
	Then A user enters "ABC123457" in "Confirm your password" field on the "register" page 
	When A user clicks the "register back" button on the "register" page
	Then A user is redirected to the "welcome" page
	When A user clicks the "register" button on the "welcome" page
	Then A user enters "" in "Your first name" field on the "register" page 
	Then A user enters "" in "Your surname" field on the "register" page 
	Then A user enters "" in "Your email address" field on the "register" page 
	Then A user enters "" in "Set password" field on the "register" page	

