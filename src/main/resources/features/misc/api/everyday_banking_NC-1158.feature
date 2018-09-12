Feature: Accounts MS: Implement correcting query NC-1158
#As there is handler in place this feature wont work
#lastSuccessfulTrnxsRefresh chnaged the field per latest dev code

Scenario: get request for getNextAccountToTranRefresh when no accounts left to refresh and pick up next priority account
    Given a request to "account refresh token" api on service "accounts microservice" 
    When the "get" request is sent
    Then the status code will be "500"
    Then the "name" will be present on the response "payload" with value "AccountNotFoundException"
    Then the "message" will be present on the response "payload" with value "Account not found"
	Then wait 5 minute(s)
	When the "get" request is sent
    Then the status code will be "200"
    Then the "accountId" will be present on response "payload"
    Then the "institution" will be present on response "payload"
    Then the "consent" will be present on response "payload"
    Then the "lastSuccessfulTrnxsRefresh" will be present on response "payload"
    