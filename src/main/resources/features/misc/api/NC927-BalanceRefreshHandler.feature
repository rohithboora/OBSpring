Feature: API-NC927-Implement ‘BalanceRefreshHandler’ microservice
#Updated with new balance refresh API

Scenario: post request for API triggerBalanceRefresh when there is no consent in body
    Given a request to "balance refresh handler" api on service "balanceRefresh microservice"
    And the "Content-Type" "header" parameter is "application/json"
    And the "accountId" "payload" parameter is "0122834356"
    And the "institution" "payload" parameter is "bluebank"
    When the "post" request is sent
    Then the status code will be "400"

#This test is not working properly because it is sending the consent as a string rather than an object,
#so we can't conclude that this test is testing the correct scenario
Scenario: post request for API triggerBalanceRefresh when there is no account ID in body
    Given a request to "balance refresh handler" api on service "balanceRefresh microservice"
    And the "Content-Type" "header" parameter is "application/json"
    And the "consent" "payload" parameter is "{ token: 'XXX-token' }"
    And the "institution" "payload" parameter is "bluebank"
    When the "post" request is sent
    Then the status code will be "400"

#This test is not working properly because it is sending the consent as a string rather than an object,
#so we can't conclude that this test is testing the correct scenario
Scenario: post request for API triggerBalanceRefresh when there is no institution in body
    Given a request to "balance refresh handler" api on service "balanceRefresh microservice"
    And the "Content-Type" "header" parameter is "application/json"
    And the "accountId" "payload" parameter is "0122834356"
    And the "consent" "payload" parameter is "{ token: 'XXX-token' }"
    When the "post" request is sent
    Then the status code will be "400"

#This test can be uncommented when we are able to get balances from our OB APIs
#Scenario: post request for API triggerBalanceRefresh when we send the institution, account ID and consent in the body
    #Given a request to "balance refresh handler" api on service "shared components"
    #And the "Content-Type" "header" parameter is "application/json"
    #And the "accountId" "payload" parameter is "0122834356"
    #And the "institution" "payload" parameter is "bluebank"
    #And the "consent" "payload" parameter is "{ token: 'XXX-token' }"
    #When the "post" request is sent
    #Then the status code will be "200"
    #Then the "message" will be present on the response "payload" with value "The service marked the balance refresh as complete"

#When test harness is improved we can mock if one of the APIs that are called from this API fail and make tests in accordance to that. 