Feature: User checks for email id passed in Personal details- email already registered NC975

Scenario: To check the email passed in registeration is valid
	Given a request to "check register" api on service "everyday banking"
	And the "Accept" "header" parameter is "application/json" 
	And the "email" "payload" parameter is "v3@v3.com"
	When the "post" request is sent 
	Then the status code will be "200" 
	And the "alreadyRegister" "payload" parameter is "false"
	
Scenario: To check the email passed in registeration is valid
	Given a request to "check register" api on service "everyday banking"
	And the "Accept" "header" parameter is "application/json" 
	And the "email" "payload" parameter is "j1@j1.com"
	When the "post" request is sent 
	Then the status code will be "200" 
	And the "alreadyRegister" "payload" parameter is "false"
	

	
	
