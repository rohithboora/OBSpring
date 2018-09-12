Feature: Audit events setup script for (user Log In)
	
Scenario: Setup for user log in User
	Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "64" 
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	Then A user enters "logInEvent@hotmail.com" in "email" field on the "login" page 
	Then A user enters "Pass1111" in "password" field on the "login" page 
	When A user clicks the "log me in" button on the "login" page 
	Then A user is redirected to the "chatbot" page 
	When A user clicks the "logout" button on the "chatbot" page
	When A user clicks the "yes" button on the "chatbot" page
	

	
	
	
	
	