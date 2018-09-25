@demo
Feature: Provide possibility to store and retrieve and delete balance information

  @severity=normal
  @issue=NC-2778
  @happyCase
  @deleteAccFromBalancesBefore
  Scenario: Store balances for specific account
    Given a request to "store balance" api on service "balance microservice"
    When "accountId" is "balanceTestId" as STRING
    And "currency" is "EUR" as STRING
    And "amount" is "20" as STRING
    And "creditIndicator" is "Credit" as STRING
    And "dateTime" is "actualDate" as STRING
    And "type" is "ClosingAvailable" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "200"
    Then successful validation message is "Inserted balance records into the database"

  @severity=normal
  @issue=NC-2778
  @happyCase
  Scenario: Retrieve balances for specific account
    Given a request to "get balance account" api on service "balance microservice"
    When "accountId" parameter is "balanceTestId"
    And "GET" request is sent
    Then the status code will be "200"

  @severity=normal
  @issue=NC-2778
  @happyCase
  Scenario: Delete balances for specific account
    Given a request to "delete balance account" api on service "balance microservice"
    When "accountId" parameter is "balanceTestId"
    And "DELETE" request is sent
    Then the status code will be "200"