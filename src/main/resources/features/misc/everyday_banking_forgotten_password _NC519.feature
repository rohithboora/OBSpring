@ignore
Feature: Verifying Reset password and Forget password functionality NC-519

#STILL TO BE MIGRATED!!!!!

Scenario: User successfully resets password 
	Given A user access "welcome" section of "everyday banking" application using "firefox" browser at version "47" 
	When A user clicks the "login" button on the "welcome" page
	When A user clicks the "forgotten password" button on the "login" page
	Then A user is redirected to the "reset-password" page 
	Then A user enters "nc519@test.com" in "email" field on the "reset-password" page 
	When A user clicks the "reset password" button on the "reset-password" page
	Then A user is redirected to the "thanks" page
	#Then the user will get forget password link in email 
	#    And the user will enter new 'password' in "Set password" textbox
	#      | newpassword1234 |
	#    And the user will click button "Update Password" button
	#    Then user will see the "Thanks" screen

Scenario: 
	User enters invalid email address/formate in the forgotten password screen 
Given A user access "welcome" section of "everyday banking" application using "firefox" browser at version "47" 
	When A user clicks the "login" button on the "welcome" page
	When A user clicks the "forgotten password" button on the "login" page
	Then A user is redirected to the "reset-password" page  
#	When the user enters email 
#		| koom |
#	Then the user "click" on the "reset password" button on the reset password page 
#	Then the user will see validation error message on reset password page 
#		| Something is not right. Please try again. |
		
Scenario: User enters an invalid password format for the new password setting 
	Given A user access "welcome" section of "everyday banking" application using "firefox" browser at version "47" 
	When A user clicks the "login" button on the "welcome" page
	When A user clicks the "forgotten password" button on the "login" page
	Then A user is redirected to the "reset-password" page 
#	When the user enters email 
#		| komalathom@gmail.com |
#	Then the user "click" on the "reset password" button on the reset password page 
#	Then the user is redirected to the "thanks" section of "everyday banking" application 
#	    Then I should get forget password link in mail
#	    When I enter new password in "Set password"
#	      | kk |
#	    When I enter new password in "confirm password"
#	      | kk |
#	    Then I click button "Update Password"
#	    Then I should see error message
#	      | Something went wrong. |
	
	
	
	
	
	
	
