@demo
Feature: Provide possibility to store and retrieve recent balance

  @severity=normal
  @issue=NC-2778
  @happyCase
  @deleteAccFromBalancesAfter
  Scenario: Retrieve most recent interim available balance by accountId
    Given a request to "store balance" api on service "balance microservice"
    When "accountId" is "balanceTestId" as STRING
    And "currency" is "EUR" as STRING
    And "amount" is "20" as STRING
    And "creditIndicator" is "Credit" as STRING
    And "dateTime" is "actualDate" as STRING
    And "type" is "InterimAvailable" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "200"
    And successful validation message is "Inserted balance records into the database"
    And a request to "get balance most recent" api on service "balance microservice"
    When "accountId" parameter is "balanceTestId"
    And "GET" request is sent
    And check if "accountId" is "balanceTestId" from response at "0" array
    Then the status code will be "200"