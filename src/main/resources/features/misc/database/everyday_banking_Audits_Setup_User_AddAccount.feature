Feature: Audit events setup script for (add account)
	
	
Scenario: Setup for Add an Account
	Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "64" 
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters "addAccountEvent@hotmail.com" in "email" field on the "login" page
	When A user enters "Pass1111" in "password" field on the "login" page
	When A user clicks the "log me in" button on the "login" page  
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Home" in "chatinput" field on the "chatbot" page
	When A user clicks the "sendchat" button on the "chatbot" page
	When A user clicks the "account overview" button on the "chatbot" page
	Then A user is redirected to the "account-overview" page 
	When A user clicks the "add account" button on the "account-overview" page
	Then A user is redirected to the "select-provider" page 
	When A user clicks the "nationwide" button on the "select-provider" page
	When A user clicks the "next" button on the "select-provider" page
	Then A user is redirected to the "openbanking-auth" page 
	Then A user enters "01234570" in "customer number" field on the "openbanking-auth" page 
	Then A user enters "s" in "box1" field on the "openbanking-auth" page 
	Then A user enters "@" in "box2" field on the "openbanking-auth" page 
	Then A user enters "3" in "box3" field on the "openbanking-auth" page
	When A user clicks the "sms" button on the "openbanking-auth" page
	Then A user enters "447879897740" in "mobile number" field on the "openbanking-auth" page 
	Then A user enters "1234" in "one-time passcode" field on the "openbanking-auth" page 
	When A user clicks the "log in" button on the "openbanking-auth" page
	When A user clicks the "authorise" button on the "openbanking-auth" page

	
	
	
	
	