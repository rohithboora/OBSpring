Feature: API - Use appropriate balance type for different balance queries NC-1153

Scenario: Endpoint 1 testing records are returned for /api/balances/:accountId?type=balanceType
	Given a request to "get balance by type" api on service "balance microservice"
	And the "accountId" "path" parameter is "22289"
	And the "balanceType" "path" parameter is "InterimAvailable"
	When the "get" request is sent
	Then the status code will be "200"

Scenario: Endpoint 2 /api/balances/mostRecent/:accountId (which was previously /api/balances/mostRecentBalance/:accountId)
	Given a request to "get balance most recent" api on service "balance microservice"
	And the "accountId" "path" parameter is "22289"
	When the "get" request is sent
	Then the status code will be "200"

Scenario: Endpoint 2 test user not found in database and returns 500 
	Given a request to "get balance most recent" api on service "balance microservice" 
	And the "accountId" "path" parameter is "989898" 
	When the "get" request is sent 
	Then the status code will be "500" 
	
Scenario: Endpoint 2 that old enpoint is defunct and returning 404 
	Given a request to "get balance most recent old endpoint" api on service "balance microservice" 
	And the "accountId" "path" parameter is "22289" 
	When the "get" request is sent 
	Then the status code will be "404"