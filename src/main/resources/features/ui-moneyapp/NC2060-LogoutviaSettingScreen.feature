@ui @regression
Feature: UI-NC2060-User log outs successfully via setting page with time out pop up

  Scenario: AC1 & AC2 A user tries to navigate to settings screen in everyday banking application
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    Then A user is redirected to the "settings" page

  Scenario: A user tries to choose yes on logout pop up in everyday banking application
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "logout" button on the "settings" page
    Then A user clicks the "yes" button on the "settings" page


  Scenario: A user tries to choose cancel on logout pop up in everyday banking application
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "logout" button on the "settings" page
    And A user clicks the "cancel" button on the "settings" page
    Then A user is redirected to the "settings" page


  Scenario: A user tries to click back button on settings screen in everyday banking application
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "log me in" button on the "login" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user clicks the "settings" button on the "chatbot" page
    And A user is redirected to the "settings" page
    And A user clicks the "back" button on the "settings" page
    Then A user is redirected to the "chatbot" page
   

#Scenario: A user tries to click No on logout popup in settings screen
#	Given A user access "welcome" section of "everyday banking" application
#	When A user clicks the "log me in" button on the "login" page
#	And A user is redirected to the "login" page
#	And A user enters credentials on page
#		| automationtest@test.com | Password@12|
#	And A user is redirected to the "chatbot" page
#	And A user clicks the "settings" button on the "chatbot" page
#	And A user is redirected to the "settings" page
#	When A user remains idle for "4" minutes on "settings" page
#	And A user clicks the "idleNo" button on the "chatbot" page
#	When A user remains idle for "4" minutes on "settings" page
	
#Scenario: A user tries to click No on logout popup in settings screen
#	Given A user access "welcome" section of "everyday banking" application
#	When A user clicks the "log me in" button on the "login" page
#	And A user is redirected to the "login" page
#	And A user enters credentials on page
#		| automationtest@test.com | Password@12|
#	And A user is redirected to the "chatbot" page
#	And A user clicks the "settings" button on the "chatbot" page
#	And A user is redirected to the "settings" page
#	When A user remains idle for "4" minutes on "settings" page
#	And A user clicks the "idleYes" button on the "chatbot" page
#	When A user remains idle for "4" minutes on "settings" page
	

	
	
   