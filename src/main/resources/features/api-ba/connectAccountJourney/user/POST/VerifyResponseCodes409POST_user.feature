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
Feature: verify 409 Response codes

	Background:
		Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"

  @severity=normal @issue=NC-2838
  Scenario: Verify 409 Response when duplicate BANKING_APP customerNumber is used
    And "x-channel-id" header is "BANKING_APP"
    When "customerNumber" is "9879879871" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "409"
    And error validation message is "The specified resource already exists"
    
  @severity=normal @issue=NC-2838
  Scenario: Verify 409 Response when duplicate MONEY_APP user is used
 		And "x-channel-id" header is "MONEY_APP"
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "test@test.com" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "409"
    And error validation message is "The specified resource already exists"
    
    
   
   
    
  
  
  
  
  
  
  
  
  
  
  
  	
 
  
  
  
  
  
  
  
  
  
  
