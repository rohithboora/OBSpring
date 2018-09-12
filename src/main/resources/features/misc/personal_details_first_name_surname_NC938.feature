@ignore
Feature: Personal Details- First name, surname NC-938

#STILL TO BE MIGRATED!!!!!!!!!!!!!

Scenario:
User clicks register, fills in all mandatory fields except first name, clicks next and gets error Something is not right. Please try again. 
	Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "63" 
	When the user "click" on the "Register" option on the "welcome" section 
	Then the user is redirected to the "Personal Details" section of "everyday banking" application 
	Then the user enters "Test" in "Your surname field" on the "PersonalDetails" section 
	Then the user enters "Test@test.com" in "Your email address Field" on the "PersonalDetails" section 
	Then the user enters "ABC12345!" in "Set password field" on the "PersonalDetails" section 
	Then the user enters "ABC12345!" in "Confirm password field" on the "PersonalDetails" section 
	When the user "click" on the "Submit Registration Button" option on the "PersonalDetails" section 
	Then the user will "see" text "Something is not right. Please try again." on "PersonalDetails" section 
	Then the user close the browser 
	
	
Scenario:
User clicks register, fills in all mandatory fields except surname, clicks next and gets error "Something is not right. Please try again." 
	Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "63" 
	When the user "click" on the "Register" option on the "welcome" section 
	Then the user is redirected to the "Personal Details" section of "everyday banking" application 
	Then the user enters "Test" in "Your first name field" on the "PersonalDetails" section 
	Then the user enters "Test@test.com" in "Your email address Field" on the "PersonalDetails" section 
	Then the user enters "ABC12345!" in "Set password field" on the "PersonalDetails" section 
	Then the user enters "ABC12345!" in "Confirm password field" on the "PersonalDetails" section 
	When the user "click" on the "Submit Registration Button" option on the "PersonalDetails" section 
	Then the user will "see" text "Something is not right. Please try again." on "PersonalDetails" section 
	Then the user close the browser 
	
	
Scenario:
User clicks register, fills in all mandatory fields except first name & surname, clicks next and gets error "Something is not right. Please try again." 
	Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "63" 
	When the user "click" on the "Register" option on the "welcome" section 
	Then the user is redirected to the "Personal Details" section of "everyday banking" application 
	Then the user enters "Test@test.com" in "Your email address Field" on the "PersonalDetails" section 
	Then the user enters "ABC12345!" in "Set password field" on the "PersonalDetails" section 
	Then the user enters "ABC12345!" in "Confirm password field" on the "PersonalDetails" section 
	When the user "click" on the "Submit Registration Button" option on the "PersonalDetails" section 
	Then the user will "see" text "Something is not right. Please try again." on "PersonalDetails" section 
	Then the user close the browser