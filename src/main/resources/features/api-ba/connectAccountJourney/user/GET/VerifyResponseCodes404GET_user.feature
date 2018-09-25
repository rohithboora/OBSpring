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
Feature: verify 404 Response codes

  Background:
    Given a request to "get user" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"

  @severity=normal
  @issue=NC-2845
  Scenario: 404 Unable to find user for given customer number
    When "customerNumber" parameter is "0000001111"
    When "channelId" parameter is "BANKING_APP"
    And package prepared data
    And "GET" request is sent to user endpoint
    And the status code will be "404"
    And error validation message is "Unable to find user for given customer number"
   
 