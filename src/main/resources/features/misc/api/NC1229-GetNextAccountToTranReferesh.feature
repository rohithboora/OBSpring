Feature: API-NC1229-NC1158-NC1132-The cron gets the accounts & removes them, the payload values are getting modified
#insert an account
#check for the value with 00 , then 2,1
#getNextAccountForTransactionRefresh must display the account id


Scenario: Check for get request of getNextAccountToTranRefresh when account to refresh

	Given a request to "account refresh token" api on service "accounts microservice" 
	And the "Accept" "header" parameter is "application/json" 
	When the "get" request is sent 
	Then the status code will be "500" 
	Then the "name" will be present on the response "payload" with value "AccountNotFoundException" 
	Then the "message" will be present on the response "payload" with value "Account not found" 
	
	
	
	
	
    