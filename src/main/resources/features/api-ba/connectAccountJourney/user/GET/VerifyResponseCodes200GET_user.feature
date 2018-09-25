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
 Feature: verify 200 Response for GET user

 @severity=normal
  @issue=NC-2838
  @happyCase
  Scenario: 201 Response when passing valid POST Banking App request
    Given a request to "post user" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"
    When "customerNumber" is "1234565434" as STRING
    And "firstName" is "TestForename" as STRING
    And "lastName" is "TestSurname" as STRING
    And "email" is "get200@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent to user endpoint
    And the status code will be "201"

   @severity=normal
   @issue=NC-2845 @happyCase
   Scenario: 200 Response when when passing a valid GET request
     Given a request to "get user" api on service "user microservice"
     And "x-channel-id" header is "BANKING_APP"
     When "customerNumber" parameter is "1234565434"
     When "channelId" parameter is "BANKING_APP"
     And "GET" request is sent to user endpoint
     And the status code will be "200"
     
  @severity=normal
  @issue=NC-2838 @happyCase
  Scenario: delete BA user profile
    Given a request to "delete user profile" api on service "user microservice"
    And "x-channel-id" header is "BANKING_APP"
    And "Authorization" header is "Basic b3BlcmF0aW9uQW5hbHlzdDowcGVyYXRpMG5BbmFseXN0"
    And "userEmail" is "get200@test.com" as STRING
    And "channelId" is "BANKING_APP" as STRING
    And package prepared data
    And "POST" request is sent to remove user
    And the status code will be "200"
    
    
