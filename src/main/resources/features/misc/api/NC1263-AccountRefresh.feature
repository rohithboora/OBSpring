Feature: API-NC1263-Account refresh: Add status change as part of transaction

#As there is handler in place this feature wont work
#Scenario: Trigger Transaction refresh with correct account no
#    Given a request to "unlock account refresh" api on service "accounts microservice"
#    And the "Content-Type" "header" parameter is "application/json"
#    And the payload is
#    """
#   	{
#	"accountId": "10000002",
#	"institution": "nationwide",
#	"trxnsSaved": 5
#	}
#	 """
#    When the "put" request is sent
#    Then the status code will be "200"
#    Then the "n" will be present on the response "payload" with value "1"
#    Then the "nModified" will be present on the response "payload" with value "1"
#	Then the "ok" will be present on the response "payload" with value "1"
 
 Scenario: Trigger Transaction refresh with incorrect account no
    Given a request to "unlock account refresh" api on service "accounts microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
   	{
	"accountId": "10900000",
	"institution": "nationwide",
	"trxnsSaved": 5
	}  
	 """
    When the "put" request is sent
    Then the status code will be "500"
    Then the "error.name" will be present on the response "payload" with value "AccountNotFoundException"
    Then the "error.message" will be present on the response "payload" with value "No match for transactions refresh complete query"
	