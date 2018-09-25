@demo
Feature: Store balances with empty accountId

  @severity=normal
  @issue=NC-2778
  @failureCase
  Scenario: Store balances for specific account with empty accountId
    Given a request to "store balance" api on service "balance microservice"
    When "accountId" is "" as STRING
    And "currency" is "EUR" as STRING
    And "amount" is "20" as STRING
    And "creditIndicator" is "Credit" as STRING
    And "dateTime" is "actualDate" as STRING
    And "type" is "ClosingAvailable" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "500"
    Then error validation message is "Balances validation failed: accountId: Path `accountId` is required."