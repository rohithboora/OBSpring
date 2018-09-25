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
Feature: verify 409 Response codes

 Thomas_NC-2838
 ajerthan/settingsxml-edited-online-with-bitbucket-1534954387748

	Background:
		Given a request to "post user" api on service "user microservice"
		
		
	@severity=normal
  @issue=NC-2838ß
  Scenario: create user to test 409 Response for BA user
    Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"
    When "customerNumber" is "9999911111" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "createuserfor409ba@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent to user endpoint
    And the status code will be "201"
   

  @severity=normal
  @issue=NC-2838
  Scenario: create user to test 409 Response for MA user
    Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "MONEY_APP"
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "createuserfor409ma@test.com" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
    And "POST" request is sent to user endpoint
    And the status code will be "201"
		
		

  @severity=normal @issue=NC-2838
  Scenario: Verify 409 Response when duplicate BANKING_APP customerNumber is used
    And "x-channel-id" header is "BANKING_APP"
    When "customerNumber" is "9999911111" as STRING
    And "firstName" is "Thomas" as STRING
    And "lastName" is "G" as STRING
    And "email" is "user@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
 		And "POST" request is sent to user endpoint
    And the status code will be "409"
    And error validation message is "User already exists"
    
  @severity=normal @issue=NC-2838
  Scenario: Verify 409 Response when duplicate MONEY_APP user is used
 		And "x-channel-id" header is "MONEY_APP"
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "createuserfor409ma@test.com" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
  	And "POST" request is sent to user endpoint
    And the status code will be "409"
    And error validation message is "User already exists"
    
    
   
   
    
  
  
  
  
  
  
  
  
  
  
  
  	
 
  
  
  
  
  
  
  
  
  
  
