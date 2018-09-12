@ignore
Feature: Create T&Cs Page NC-968

#needs refactored

#Scenario: User clicks register, enters valid details, clicks submit, user is taken to the terms and conditions screen, user verifies headers, accept T&Cs button, No thanks button
#    Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "63"
#    When the user "click" on the "Register" option on the "welcome" section
#    Then the user is redirected to the "Personal Details" section of "everyday banking" application
#    Then the user enters "Firstname" in "Your first name Field" on the "PersonalDetails" section
#    Then the user enters "Surname" in "Your surname Field" on the "PersonalDetails" section
#    Then the user enters "a3@a3.com" in "Your email address Field" on the "PersonalDetails" section
#    Then the user enters "ABC12345" in "Set password field" on the "PersonalDetails" section
#    Then the user enters "ABC12345" in "Confirm password field" on the "PersonalDetails" section
#    When the user "click" on the "Submit Registration Button" option on the "PersonalDetails" section
#    Then the user is redirected to the "TandC" section of "everyday banking" application
#    Then the user will "see" "Terms and Conditions Title" in "TandC" section
#    Then the user will "see" "Header 1" in "TandC" section
#    Then the user will "see" "Header 2" in "TandC" section
#    Then the user will "see" "Header 3" in "TandC" section
#    Then the user will "see" "Header 4" in "TandC" section
#    Then the user will "see" "Header 5" in "TandC" section
#    Then the user will "see" "Accept TandC button" in "TandC" section
#    Then the user will "see" "No Thanks button" in "TandC" section
#    Then the user close the browser
 
 @ignore   
 Scenario: User clicks register, enters valid details, clicks submit, user is taken to the terms and conditions screen, user clicks no thanks button, user is taken back to welcome page
    Given A user access "welcome" section of "everyday banking" application using "chrome" browser at version "63"
    When the user "click" on the "Register" option on the "welcome" section
    Then the user is redirected to the "Personal Details" section of "everyday banking" application
    Then the user enters "Firstname" in "Your first name Field" on the "PersonalDetails" section
    Then the user enters "Surname" in "Your surname Field" on the "PersonalDetails" section
    Then the user enters "a3@a3.com" in "Your email address Field" on the "PersonalDetails" section
    Then the user enters "ABC12345" in "Set password field" on the "PersonalDetails" section
    Then the user enters "ABC12345" in "Confirm password field" on the "PersonalDetails" section
    When the user "click" on the "Submit Registration Button" option on the "PersonalDetails" section
	Then the user "click" on the "No Thanks button" option on the "TandC" section
	Then the user is redirected to the "welcome" section of "everyday banking" application
    Then the user close the browser