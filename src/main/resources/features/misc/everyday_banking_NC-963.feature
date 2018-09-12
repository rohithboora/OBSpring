@ignore
Feature: Personal details - Create password confirm password NC-963

Background:
 	Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "63"
    When A user clicks the "register" button on the "welcome" page 
    Then A user is redirected to the "register" page 
@ignore
Scenario: A User enters valid details for mandatory fields, clicks submit and is taken to T&Cs page
	Then A user enters details on the "register" page
	|your first name|Name|
	|your surname|Surname|
	|your email address|NameSurname@Test.com|
	|set password|Password123|
	|confirm your password|Password123|
	Then the user "click" on the "Submit Registration Button" option on the "PersonalDetails" section
	Then the user is redirected to the "TandC" section of "everyday banking" application
	
Scenario: User enters 2 unique but valid passwords, both password fields turn red
Then A user enters details on the "register" page
	|set password|Password123|
	|confirm your password|PASSword123|
	Then the user will "see" colour red on "Confirm password field" on "PersonalDetails" section
		
Scenario: User enters unique invalid passwords, both password fields turn red
	Then A user enters details on the "register" page
	|set password|Pass|
	|confirm your password|passwordhere|
	Then the user will "see" colour red on "Set password field" on "PersonalDetails" section
	Then the user will "see" colour red on "Confirm password field" on "PersonalDetails" section
	
Scenario: User enters matching invalid passwords, both password fields turn red
Then A user enters details on the "register" page
	|set password|!!!|
	|confirm your password|!!!|
	Then the user will "see" colour red on "Set password field" on "PersonalDetails" section
	Then the user will "see" colour red on "Confirm password field" on "PersonalDetails" section

Scenario: User enters a password longer than 20 characters in the Set password field
Then A user enters details on the "register" page
	|set password|MoreThanTwenty1234567890|
	Then the user will "see" colour red on "Set password field" on "PersonalDetails" section
	
Scenario: User enters a password longer than 20 characters in the Confirm password field
Then A user enters details on the "register" page
	|set password|MoreThanTwenty1234567890|
	|confirm your password|MoreThanTwenty1234567890|
	Then the user will "see" colour red on "Set password field" on "PersonalDetails" section
	Then the user will "see" colour red on "Confirm password field" on "PersonalDetails" section

