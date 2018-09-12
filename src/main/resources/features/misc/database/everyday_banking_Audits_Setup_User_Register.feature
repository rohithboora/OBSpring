Feature: Audit events setup script for (user registration)


Scenario: Setup for Register User
	Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "64" 
	When A user clicks the "register" button on the "welcome" page 
	Then A user is redirected to the "register" page 
	Then A user enters "Audit" in "Your first name" field on the "register" page 
	Then A user enters "Events" in "Your surname" field on the "register" page 
	Then A user enters "registerUserAudit@hotmail.com" in "Your email address" field on the "register" page 
	Then A user enters "Pass1111" in "Set password" field on the "register" page 
	Then A user enters "Pass1111" in "Confirm your password" field on the "register" page 
	When A user clicks the "next" button on the "register" page 
	When A user clicks the "confirm details" button on the "register" page 
	When A user clicks the "accept" button on the "tandc" page 
	Then A user is redirected to the "thanks" page 
	When A user clicks the "Meet VA" button on the "thanks" page 
	Then A user is redirected to the "chatbot" page 
	When A user clicks the "logout" button on the "chatbot" page
	When A user clicks the "yes" button on the "chatbot" page
	
	
	
	
	