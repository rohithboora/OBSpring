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
Feature: Validation of POST response schema

  @severity=normal
  @issue=NC-2838ß
  Scenario: Assert that response schema for BANKING_APP passes schema validation
    Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"
    When "customerNumber" is "1280054132" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "testinguserschema@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent to user endpoint
    And the status code will be "201"
    And schema successfully validated against "BA-post-user-response-schema.json"

  @severity=normal
  @issue=NC-2838
  Scenario: Assert that response schema for MONEY_APP passes schema validation
    Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "MONEY_APP"
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "matestingschema@test.com" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
    And "POST" request is sent to user endpoint
    And the status code will be "201"
    And schema successfully validated against "MA-post-user-response-schema.json"

  @severity=normal
  @issue=NC-2838
  @happyCase
  Scenario: delete BA user profile used for schema validation
    Given a request to "delete user profile" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"
    And "Authorization" header is "Basic b3BlcmF0aW9uQW5hbHlzdDowcGVyYXRpMG5BbmFseXN0"
    And "userEmail" is "testinguserschema@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent to remove user
    And the status code will be "200"

  @severity=normal
  @issue=NC-2838
  @happyCase
  Scenario: delete MA user profile used for schema validation
    Given a request to "delete user profile" api on service "user microservice"
    And "x-channel-id" header is "MONEY_APP"
    And "Authorization" header is "Basic b3BlcmF0aW9uQW5hbHlzdDowcGVyYXRpMG5BbmFseXN0"
    And "userEmail" is "matestingschema@test.com" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
    And "POST" request is sent to remove user
    And the status code will be "200"  
    
    
    
    
   	
   	
   	
   	
   	
   	