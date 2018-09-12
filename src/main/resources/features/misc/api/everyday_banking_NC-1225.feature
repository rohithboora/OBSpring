Feature: (Categorisation) Accounts MS: Retrieve an account that requires transactions to be categorised NC-1225

Scenario: User sends request to an account which has mapped category null
    Given a request to "triggerTransactionCategorisation" api on service "categorisation handler microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
   "accountId": "31820",
	"userId": "testUserId"
	}
    """
    When the "post" request is sent 
    Then the status code will be "200"
	Then the "message" will be present on the response "payload" with value "The service marked the transaction categorisation as complete"     

	
	
	Scenario: User invalid account id
    Given a request to "triggerTransactionCategorisation" api on service "categorisation handler microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
   "accountId": "31820",
	"userId": "testUserId"
	}
    """
    When the "post" request is sent 
    Then the status code will be "500"
	Then the "error" will be present on the response "payload" with value "No transactions that need categorisation returned from transaction micro-service"
	
	
	
	Scenario: User invalid user id
    Given a request to "triggerTransactionCategorisation" api on service "categorisation handler microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
   "accountId": "31820",
	"userId": "1-2testUserId"
	}
    """
    When the "post" request is sent 
    Then the status code will be "500"
	Then the "error" will be present on the response "payload" with value "Unable to get user"