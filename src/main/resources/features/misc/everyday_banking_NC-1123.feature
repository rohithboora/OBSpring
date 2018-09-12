Feature: Registeration page on submission opens a  , first turn off the toggle swith for whitlist NC1123

Background:
Given A user access "welcome" section of "everyday banking" application 
	When A user clicks the "register" button on the "welcome" page 
	Then A user is redirected to the "register" page 

Scenario: User registers and click Next button and click confirm button
	Then A user enters "aarthI222" in "Your first name" field on the "register" page 
	Then A user enters "gk1" in "Your surname" field on the "register" page 
	Then A user enters "b42@b4.com" in "Your email address" field on the "register" page
	Then A user enters "Ab@123457" in "Set password" field on the "register" page
	Then A user enters "Ab@123457" in "Confirm your password" field on the "register" page
	When A user clicks the "Next" button on the "register" page 
	Then A user should see the "Firstname" field highlighted in "blue" on the "register" page
	Then A user should see the "Surname" field highlighted in "blue" on the "register" page
	Then A user should see the "email" field highlighted in "blue" on the "register" page
	Then A user should see the "set password" field highlighted in "blue" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "blue" on the "register" page
	Then The screen should display the the following elements: 
		| Confirm Details        |
		| Edit your details      |
	When A user clicks the "Confirm Details" button on the "register" page 
	Then A user is redirected to the "tandc" page 
		



Scenario:
User registers and confirms and cannot edit the screen
	Then A user enters "aarthI222" in "Your first name" field on the "register" page 
	Then A user enters "gk1" in "Your surname" field on the "register" page 
	Then A user enters "b4@b4.com" in "Your email address" field on the "register" page 
	Then A user enters "ABC123457" in "Set password" field on the "register" page 
	Then A user enters "ABC123457" in "Confirm your password" field on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	Then A user should see the "Firstname" field highlighted in "blue" on the "register" page
	Then A user should see the "Surname" field highlighted in "blue" on the "register" page
	Then A user should see the "email" field highlighted in "blue" on the "register" page
	Then A user should see the "set password" field highlighted in "blue" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "blue" on the "register" page


Scenario:
User registers and click Next button and click edit button
	Then A user enters "aarthI333" in "Your first name" field on the "register" page 
	Then A user enters "gk1" in "Your surname" field on the "register" page 
	Then A user enters "b4@b4.com" in "Your email address" field on the "register" page 
	Then A user enters "ABC123457" in "Set password" field on the "register" page 
	Then A user enters "ABC123457" in "Confirm your password" field on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	Then A user should see the "Firstname" field highlighted in "blue" on the "register" page
	Then A user should see the "Surname" field highlighted in "blue" on the "register" page
	Then A user should see the "Your email address" field highlighted in "blue" on the "register" page
	Then A user should see the "Set password" field highlighted in "blue" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "blue" on the "register" page
	When A user clicks the "Edit your details" button on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	When A user clicks the "edit your details" button on the "register" page
	Then A user should see the "Set password" field highlighted in "red" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "red" on the "register" page
	Then A user enters "ABC123457" in "Set password" field on the "register" page 
	Then A user enters "ABC123457" in "Confirm your password" field on the "register" page 



Scenario:
User registers and click Next button and click back button
	Then A user enters "aarthI333" in "Your first name" field on the "register" page 
	Then A user enters "gk1" in "Your surname" field on the "register" page 
	Then A user enters "b4@b4.com" in "Your email address" field on the "register" page 
	Then A user enters "ABC123457" in "Set password" field on the "register" page 
	Then A user enters "ABC123457" in "Confirm your password" field on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	Then A user should see the "Firstname" field highlighted in "blue" on the "register" page
	Then A user should see the "Surname" field highlighted in "blue" on the "register" page
	Then A user should see the "Your email address" field highlighted in "blue" on the "register" page
	Then A user should see the "Set password" field highlighted in "blue" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "blue" on the "register" page
	When A user clicks the "Edit your details" button on the "register" page 
	When A user clicks the "Next" button on the "register" page 
	When A user clicks the "back" button on the "register" page
	Then A user should see the "Set password" field highlighted in "red" on the "register" page 
	Then A user should see the "confirm password" field highlighted in "red" on the "register" page
	Then A user enters "ABC123457" in "Set password" field on the "register" page 
	Then A user enters "ABC123457" in "Confirm your password" field on the "register" page 
	

