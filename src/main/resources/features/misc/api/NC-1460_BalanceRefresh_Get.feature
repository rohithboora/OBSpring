Feature: Balance Refresh: Integrate OBAC balances endpoint NC-1460

Scenario: put request for creating User Registeration to Audit microservice
Given a request to "get balance refresh" api on service "balanceRefresh microservice"
    And the "accountId" "payload" parameter is "31820"
    And the "institution" "payload" parameter is "nationwide"
    When the "Get" request is sent
    Then the status code will be "200"