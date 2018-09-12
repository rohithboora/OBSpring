Feature: (Categorisation) Accounts MS: Retrieve an account that requires transactions to be categorised NC-1214

#As there is handler in place this feature wont work
Scenario: get request for getNextAccountToCategorise when account is categorizing for the first time
    Given a request to "getNextAccountToCategorise" api on service "accounts microservice" 
    When the "get" request is sent
    Then the status code will be "200"
    Then the "accountId" will be present on the response "payload" with value "10000001"

    
Scenario: get request for getNextAccountToCategorise when account is categorizing after the first time
    Given a request to "getNextAccountToCategorise" api on service "accounts microservice" 
    When the "get" request is sent
    Then the status code will be "200"
    Then the "accountId" will be present on the response "payload" with value "10000002"
    Then the "trxnsEnrichmentId" will be present on response "payload"  
    
    
Scenario: get request for getNextAccountToCategorise when account has no new uncategorized transactions
    Given a request to "getNextAccountToCategorise" api on service "accounts microservice" 
    When the "get" request is sent
    Then the status code will be "200"
    Then the "message" will be present on the response "payload" with value "No match for transactions categorise query"