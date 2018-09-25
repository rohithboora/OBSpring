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
Feature: verify 400 Response codes

	Background:
		Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"

  @severity=normal @issue=NC-2838
  Scenario: 400 when channel id is not provided in body
    When "customerNumber" is "1207702724" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And package prepared data
  	And "POST" request is sent to user endpoint
    And the status code will be "400"
    And error validation message is "Unable to complete user registration due to insufficient/invalid fields"
   
    
  @severity=normal @issue=NC-2838
  Scenario: 400 when channel id fails validation
   	When "customerNumber" is "1207702724" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "INVALID_APP" as STRING
    And package prepared data
  	And "POST" request is sent to user endpoint
    And the status code will be "400"
    And error validation message is "Unable to complete user registration due to insufficient/invalid fields"
  
  @severity=normal @issue=NC-2838
  Scenario: 400 when channel id is banking app and customer number fails validation
  	When "customerNumber" is "01234567890" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
  	And "POST" request is sent to user endpoint
    And the status code will be "400"
    And error validation message is "Unable to complete user registration due to insufficient/invalid fields"
  
  @severity=normal @issue=NC-2838
  Scenario: 400 when channel id is money app, first name fails validation
    And "firstName" is "" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
 		And "POST" request is sent to user endpoint
    And the status code will be "400"
    And error validation message is "x-channel-id in header doesn't match with channelId in body"
  
  
  @severity=normal @issue=NC-2838
  Scenario: 400 when channel id is money app, first name, email pass validation but last name fails validation
  	And "firstName" is "TestForename" as STRING
    And "lastName" is "" as STRING
    And "email" is "test@test.com" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
		And "POST" request is sent to user endpoint
    And the status code will be "400"
    And error validation message is "x-channel-id in header doesn't match with channelId in body"
  
  @severity=normal @issue=NC-2838
  Scenario: 400 when channel id is not provided or (email, firstName & lastName)
   	And "channelId" is "MONEY_APP" as STRING
    And package prepared data
		And "POST" request is sent to user endpoint
    And the status code will be "400"
    And error validation message is "x-channel-id in header doesn't match with channelId in body"
  
  
  
  
  
  
  
  
  
  
  	
 
  
  
  
  
  
  
  
  
  
  
