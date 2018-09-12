Feature: UI - Account Overview

Scenario:
The user navigates to chatbot expects be able to click on accounts overview
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	Then A user enters "kite@kite.com" in "email" field on the "login" page
	Then A user enters "Password12" in "password" field on the "login" page
	When A user clicks the "log me in" button on the "login" page 
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Home" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the the following elements: 
		| Account Overview |
		| Spending         |
		| Move Money       |
		| Budgeting        |
		| Tell Me More     |
	Then A user enters "Account Overview" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "account-overview" page 
	When A user clicks the "back" button on the "account-overview" page 
	Then A user is redirected to the "chatbot" page