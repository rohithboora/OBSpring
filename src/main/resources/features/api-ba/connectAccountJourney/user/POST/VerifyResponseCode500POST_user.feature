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
Feature: verify 500 Response codes for POST user

Background:
		Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "MONEY_APP"
    

  @severity=normal @issue=NC-2838
  Scenario: 500 saveUserService throws error
    When "customerNumber" is "1111111111" as STRING
    And "channelId" is "MONEY_APP" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "500"
    And successful validation message is "<add here>"

    
  @severity=normal @issue=NC-2838
  Scenario: 500 when saveUserService returns empty response
  	When "customerNumber" is "1111111111" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And "firstName" is "fName" as STRING
    And "lastName" is "lName" as STRING
    And "email" is "333-CCC" as STRING
    And package prepared data
    And "POST" request is sent
    And the status code will be "500"
    And successful validation message is "<add here>"

  
  
  
  
  
  
  
  
  
  
  	
 
  
  
  
  
  
  
  
  
  
  
