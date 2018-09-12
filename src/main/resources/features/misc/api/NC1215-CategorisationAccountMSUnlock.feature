Feature: API-NC1215-(Categorisation) Account MS: Unlock an account after categorisation


Scenario: put request for setAccountAsTransactionCategorisationRefreshFinished to unlock an account
    Given a request to "setAccountAsTransactionCategorisationRefreshFinished" api on service "accounts microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "accountId" "payload" parameter is "100000001"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "nModified" will be present on response "payload"
    Then the "ok" will be present on response "payload"

    
Scenario: put request for setAccountAsTransactionCategorisationRefreshFinished when no account to unlock
    Given a request to "setAccountAsTransactionCategorisationRefreshFinished" api on service "accounts microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "accountId" "payload" parameter is "100000043242"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "nModified" will be present on response "payload"
    Then the "ok" will be present on response "payload"