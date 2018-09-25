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
Feature: Validation of GET request headers to user endpoint

  @severity=normal
  @issue=NC-2845
  Scenario: x-channel-id header is missing
    Given a request to "get user" api on service "user microservice"
    When "customerNumber" parameter is "1923335109"
    When "channelId" parameter is "BANKING_APP"
    And "GET" request is sent
    And the status code will be "401"
    And error validation message is "x-channel-id header missing"

  @severity=normal
  @issue=NC-2845
  Scenario: x-channel-id header not recognised
    Given a request to "get user" api on service "user microservice"
    And "x-channel-id" header is "INVALID_APP"
    When "customerNumber" parameter is "1923335109"
    When "channelId" parameter is "INVALID_APP"
    And package prepared data
    And "GET" request is sent to user endpoint
    And the status code will be "401"
    And error validation message is "x-channel-id header not recognized"
    
    