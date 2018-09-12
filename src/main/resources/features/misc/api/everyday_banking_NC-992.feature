Feature: API - Admin checks that the API deletes all account transactions corresponding to the accountId NC-992

Scenario: delete request for API Delete when account the account is deleted
    Given a request to "account Direct Debit" api on service "shared components"
    And the "accountId" "path" parameter is "0122834356" 
    When the "delete" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "ok" will be present on response "payload"
   
Scenario: delete request for API Delete when account the account is deleted
    Given a request to "account Direct Debit" api on service "shared components"
    And the "accountId" "path" parameter is "" 
    When the "delete" request is sent
    Then the status code will be "400"