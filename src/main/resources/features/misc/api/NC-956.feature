Feature: Create Whitelist functionality NC-956

Scenario: To Check if the user is whitelisted 
	Given a request to "account whitelist va" api on service "everyday banking"
	And the "Accept" "header" parameter is "application/json" 
	And the "email" "path" parameter is "nc956@test.com" 
	When the "get" request is sent 
	Then the status code will be "200" 
	Then the "email" will be present on response "payload"
	