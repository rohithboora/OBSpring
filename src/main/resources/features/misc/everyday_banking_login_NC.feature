@ignore
Feature: A user access welcome page for everyday banking 

Scenario: A user tries to login to the everyday banking applicaiton 
	Given A user access "welcome" section of "everyday banking" application using "firefox" browser at version "47" 
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| komalathom@gmail.com | Tester123   | 
	#Then the user will see the welcome message on the 
	
Scenario: User enters incorrect password consecutively 4 times 
	Given A user access "welcome" section of "everyday banking" application using "firefox" browser at version "47" 
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| komalathom@gmail.com | Tester123   |
	#Then the user will see validation error message on login page 
		| Something is not right. Please try again. |
		
Scenario:
TC3 User enters incorrect password consecutively 4 times and then correct one 
	Given A user access "welcome" section of "everyday banking" application using "firefox" browser at version "47" 
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| veena16g@gmail.com | tester  |
		| veena16g@gmail.com | tester  |
		| veena16g@gmail.com | tes123  |
	#Then I should see text error message
		| Something is not right. |
	When A user enters credentials on page 
		| komalathom@gmail.com | Tester123 |
	#Then I should see text welcome message
  