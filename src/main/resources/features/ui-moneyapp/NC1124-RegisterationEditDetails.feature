@ui @regression
Feature: UI-NC1124-As a user, I want to review my personal information so that I am able to confirm what I have entered on the previous page, or edit the information

Scenario: User is on Confirm details page and click confirm taken to T&C page
	Given authenticate with email "a@a.com" and password "123"
	When A user access "welcome" section of "everyday banking" application
	And A user clicks the "register" button on the "welcome" page
	And A user is redirected to the "register" page
	And A user enters "aarthI222" in "Your first name" field on the "register" page
	And A user enters "gk1" in "Your surname" field on the "register" page
	And A user enters "b44@b4.com" in "Your email address" field on the "register" page
	And A user enters "Ab@123457" in "Set password" field on the "register" page
	And A user enters "Ab@123457" in "Confirm your password" field on the "register" page
	And A user clicks the "Next" button on the "register" page
	And The screen should display the the following elements:
		| Confirm Details        |
		| Edit your details      |
	And A user clicks the "Edit your details" button on the "register" page
	And A user enters "gk1" in "Your surname" field on the "register" page
	And A user enters "Ab@123457" in "Set password" field on the "register" page
	And A user enters "Ab@123457" in "Confirm your password" field on the "register" page
	And A user clicks the "Next" button on the "register" page
	And A user clicks the "Confirm Details" button on the "register" page
	Then A user is redirected to the "tandc" page 

