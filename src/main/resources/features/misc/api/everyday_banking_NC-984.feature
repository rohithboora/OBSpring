Feature: Add functions to Accounts microservice NC-984

Scenario: put request for adding functions to accounts microservice
    Given a request to "account functions" api on service "accounts microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "accountStatus" "payload" parameter is "Removed"
    And the "accountId" "path" parameter is "876543"
    And the "bank" "path" parameter is "nationwide"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "ok" will be present on response "payload"
    
Scenario: put request for adding functions to accounts microservice
    Given a request to "account removal" api on service "accounts microservice" 
    When the "put" request is sent
    Then the status code will be "200"
    Then the "_id" will be present on response "payload"
    Then the "accountId" will be present on response "payload"
    Then the "institution" will be present on response "payload"

Scenario: delete request for account that exists in db
    Given a request to "account accountid" api on service "accounts microservice" 
    And the "accountId" "path" parameter is "17109552613"
    When the "delete" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "ok" will be present on response "payload"
    
Scenario: delete request for account that does not exist in db
    Given a request to "account accountid" api on service "accounts microservice" 
    And the "accountId" "path" parameter is "424324234"
    When the "delete" request is sent
    Then the status code will be "200"
    Then the "n" will be present on the response "payload" with value "0"
    Then the "ok" will be present on response "payload"