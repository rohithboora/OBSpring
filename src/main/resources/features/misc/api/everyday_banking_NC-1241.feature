Feature: Deploy balances MS NC-1241

Scenario: delete request for account that exists in db
    Given a request to "delete balance account" api on service "balance microservice" 
    And the "accountId" "path" parameter is "17109552613"
    When the "delete" request is sent
    Then the status code will be "404"

    
Scenario: get request for adding functions to accounts microservice
    Given a request to "get balance account ID" api on service "balance microservice" 
    When the "get" request is sent
    Then the status code will be "200"
    
Scenario: get request for adding functions to accounts microservice
    Given a request to "get balance account ID empty" api on service "balance microservice" 
    When the "get" request is sent
    Then the status code will be "404"