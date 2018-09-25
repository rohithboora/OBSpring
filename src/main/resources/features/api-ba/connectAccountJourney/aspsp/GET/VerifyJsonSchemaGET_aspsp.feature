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
Feature: Validation of GET response schema of aspsp

  @severity=normal @issue=NC-2876
  Scenario: Assert that response schema for BANKING_APP passes schema validation
	Given a request to "get aspsp" api on service "aspsp microservice"
		And "x-channel-id" header is "BANKING_APP"
		And "GET" request is sent to aspsp endpoint
    And the status code will be "200"
    And schema successfully validated against "BA-get-aspsp-response-schema.json"
 
    
   	
   	
   	
   	