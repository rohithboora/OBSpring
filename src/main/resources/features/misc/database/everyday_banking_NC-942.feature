Feature: Create audit event for log in NC-942 

Scenario: As a user, when I log in, I want an auditable event to be created in the system. 
	Given I search the collection using the audit type "User Log-in" and email "sperryman15@gmail.com" 
	Then the collection search should show event type "log in" has been recorded and has a value of "User Log-in" 
	
	
