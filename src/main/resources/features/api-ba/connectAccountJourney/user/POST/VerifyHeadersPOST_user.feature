#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@api
Feature: Validation of POST request headers to user endpoint

  @severity=normal
  @issue=NC-2838
  Scenario: x-channel-id header is missing
    Given a request to "post user" api on service "user microservice"
    When "customerNumber" is "1111111111" as STRING
    And "firstName" is "verify" as STRING
    And "lastName" is "headers" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "401"
    And error validation message is "x-channel-id header missing"

  @severity=normal
  @issue=NC-2838
  Scenario: x-channel-id header not recognized
    Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "INVALID_APP"
    When "customerNumber" is "1111111111" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent to user endpoint
    And the status code will be "401"
    And error validation message is "x-channel-id header not recognized"
    
    