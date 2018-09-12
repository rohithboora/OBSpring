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
@APIuser
Feature: verify 201 Response for POST user

  @severity=normal @issue=NC-2838 @happyCase
  Scenario: 201 Response when passing valid POST Banking App request
  	Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"
    When "customerNumber" is "1010101010" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "201"
    And successful validation message is "<add here>"
    
    
  @severity=normal @issue=NC-2838 @happyCase
  Scenario: 201 Response when passing valid POST Money App request
  	Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "MONEY_APP"
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "201"
    And successful validation message is "<add here>"
    


 
