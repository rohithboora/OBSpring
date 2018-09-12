Feature: Admin checks that the GET Transaction Refresh Microservice retrieves an account that is ready to be refreshed NC-1132

#As there is handler in place this feature wont work
Scenario: get request for getNextAccountToTranRefresh when account to refresh
    Given a request to "account refresh token" api on service "accounts microservice" 
    When the "get" request is sent
    Then the status code will be "200"
    Then the "_id" will be present on response "payload"
    Then the "accountId" will be present on response "payload"
    Then the "institution" will be present on response "payload"
    Then the "consent" will be present on response "payload"
    Then the "lastSuccessfulTrnxsRefresh" will be present on response "payload"
    