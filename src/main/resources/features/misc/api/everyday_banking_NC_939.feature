Feature: User checks for whitelist & checks for setTogglewhitelist NC939


Scenario: To Check if the user is whitelisted 
	Given a request to "account whitelist va" api on service "everyday banking"
	And the "Accept" "header" parameter is "application/json" 
	And the "email" "path" parameter is "v3@v3.com" 
	When the "get" request is sent 
	Then the status code will be "200" 
	Then the "email" will be present on response "payload"
	

Scenario: Turn the settoggle to off 
	Given a request to "toggleWhitelist" api on service "everyday banking"
	When the "get" request is sent 
	Then the status code will be "200" 
	And the "whitelistFunctionality" "payload" parameter is "false"


Scenario: To Check if the user is whitelisted 
	Given a request to "account whitelist va" api on service "everyday banking"
	And the "Accept" "header" parameter is "application/json" 
	And the "email" "path" parameter is "vj3@v3.com" 
	When the "get" request is sent 
	Then the status code will be "200" 
	Then the response "payload" is "[true]"
	

Scenario: Turn the settoggle to On 
	Given a request to "toggleWhitelist" api on service "everyday banking" 
	When the "get" request is sent 
	Then the status code will be "200" 
	And the "whitelistFunctionality" "payload" parameter is "true"
	
	
Scenario: To Check if the user is whitelisted for new emailid
	Given a request to "account whitelist va" api on service "everyday banking"
	And the "Accept" "header" parameter is "application/json" 
	And the "email" "path" parameter is "jhy3@j3.com" 
	When the "get" request is sent 
	Then the status code will be "200" 
	Then the response "payload" is "[]"
	

	
	