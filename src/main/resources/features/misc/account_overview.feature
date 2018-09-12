Feature: UI - Click Already Registered? link to go to log in page

#Duplicate as NC981
Scenario: User clicks Already registered?, is taken to the log in screen
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "register" button on the "welcome" page 
	Then A user is redirected to the "register" page 
	When A user clicks the "already registered" button on the "register" page 
	Then A user is redirected to the "login" page