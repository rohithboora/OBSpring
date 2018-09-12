Feature: Create endpoint to 'unlock' an account for trxn refresh NC-1134

Scenario: put request for 'unlock' an account for transaction refresh
    Given a request to "unlock account refresh" api on service "accounts microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "accountId" "payload" parameter is "17109552612"
    And the "institution" "payload" parameter is "nationwide"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "nModified" will be present on response "payload"
    Then the "ok" will be present on response "payload"

    Scenario: put request for 'unlock' an account for transaction refresh
    Given a request to "unlock account refresh" api on service "accounts microservice"  
    And the "Content-Type" "header" parameter is "application/json"
    And the "accountId" "payload" parameter is "1212145633752"
    And the "institution" "payload" parameter is "nationwide"
    When the "put" request is sent
    Then the status code will be "500"
    Then the "error.name" will be present on the response "payload" with value "AccountNotFoundException"
    Then the "error.message" will be present on the response "payload" with value "No match for transactions refresh complete query"
