Feature: Create Standing Order Microservice and collection NC-951

Scenario: Post request for adding functions to accounts microservice
    Given a request to "account standing orders post" api on service "accounts microservice"
    When the "post" request is sent
    Then the status code will be "400"
    
Scenario: get request for adding functions to accounts microservice
    Given a request to "account standing orders account id get" api on service "accounts microservice"
    When the "get" request is sent
    Then the status code will be "200"
    Then the "standingOrderId" will be present on response "payload"

    
Scenario: delete request for API Delete for deletion of standing orders when the account is deleted, copied from NC-991
    Given a request to "account standing orders" api on service "accounts microservice"
    And the "accountId" "path" parameter is "17109552613"
    When the "delete" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "ok" will be present on response "payload"
    
Scenario: delete request for API Delete for deletion of standing orders when the account field is empty, copied from NC-991
    Given a request to "account standing orders" api on service "accounts microservice"
    And the "accountId" "path" parameter is ""
    When the "delete" request is sent
    Then the status code will be "400"
    
Scenario: get request for adding functions to accounts microservice
    Given a request to "account standing orders user email get" api on service "accounts microservice"
    When the "get" request is sent
    Then the status code will be "200"
    Then the "standingOrderId" will be present on response "payload"
    
 Scenario: get request for adding functions to accounts microservice
    Given a request to "account standing orders user email empty" api on service "accounts microservice"
    When the "get" request is sent
    Then the status code will be "400"