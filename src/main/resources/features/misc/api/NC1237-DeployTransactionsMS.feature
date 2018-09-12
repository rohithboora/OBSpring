Feature: API-NC1237-Deploy transactions MS

    
Scenario: put request for adding functions to accounts microservice
    Given a request to "put transactions api" api on service "transaction microservice"
    And the "Content-Type" "header" parameter is "application/json"
#    And the "accountId" "path" parameter is "31820"
    And the payload is
    """
    {
     "accountId": "31820"
    }
    """
    When the "put" request is sent
    Then the status code will be "200"
    Then the "trxnsSaved" will be present on response "payload"
#    Then the "accountId" will be present on response "payload"
#    Then the "institution" will be present on response "payload"
    
Scenario: put request for adding functions to accounts microservice
    Given a request to "put transactions api" api on service "transaction microservice" 
    When the "put" request is sent
    Then the status code will be "400"
    
 Scenario: delete request for account that exists in db
    Given a request to "delete transactions api" api on service "transaction microservice" 
    And the "accountId" "path" parameter is "231"
    When the "delete" request is sent
    Then the status code will be "200"