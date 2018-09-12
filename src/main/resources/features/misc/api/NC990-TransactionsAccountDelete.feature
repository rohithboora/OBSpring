Feature: API-NC990-Add functions to Transactions Microservice

Scenario: delete request for API Delete for all transactions corresponding to the accountId from the database
    Given a request to "account delete transactions" api on service "transaction microservice"
    And the "accountId" "path" parameter is "17109552613"
    When the "delete" request is sent
    Then the status code will be "200"
    
