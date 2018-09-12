Feature: API - Admin checks that the API deletes all standing orders corresponding to the accountId NC-991


Scenario: delete request for API Delete for deletion of standing orders when the account is deleted
    Given a request to "account standing orders" api on service "shared components"
    And the "accountId" "path" parameter is "17109552613"
    When the "delete" request is sent
    Then the status code will be "200"
    Then the "n" will be present on response "payload"
    Then the "ok" will be present on response "payload"
    
Scenario: delete request for API Delete for deletion of standing orders when the account field is empty
    Given a request to "account standing orders" api on service "shared components"
    And the "accountId" "path" parameter is ""
    When the "delete" request is sent
    Then the status code will be "400"
   
