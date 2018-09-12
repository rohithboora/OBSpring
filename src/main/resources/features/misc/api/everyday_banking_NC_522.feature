Feature: User checks for account balance returning transaction for NC522

Scenario: To check the email in account is hold account balance
	Given a request to "account balance" api on service "everyday banking"
	And the "Accept" "header" parameter is "application/json" 
	And the "email" "payload" parameter is "nc522@test.com"
	When the "post" request is sent 
	Then the status code will be "200" 
