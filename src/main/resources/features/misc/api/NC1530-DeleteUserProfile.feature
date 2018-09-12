Feature: API-NC1530-Call to Delete a User Profile from Mongodb Collection

Scenario: 500 (if userEmail does not exist)
    Given a request to "delete user profile" api on service "shared components"
    And the "Authorization" "header" parameter is "Basic b3BlcmF0aW9uQW5hbHlzdDowcGVyYXRpMG5BbmFseXN0"
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	 	"userEmail" : "nothere@oops.com"
	}
    """
    When the "post" request is sent
    Then the status code will be "500"
    
    Scenario: 400 (if userEmail is not provided)
    Given a request to "delete user profile" api on service "shared components"
    And the "Authorization" "header" parameter is "Basic b3BlcmF0aW9uQW5hbHlzdDowcGVyYXRpMG5BbmFseXN0"
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	 	"userEmail" : ""
	}
    """
    When the "post" request is sent
    Then the status code will be "400"
    
    Scenario: 401 (Invalid Authorisation credentials provided)
    Given a request to "delete user profile" api on service "shared components"
    And the "Authorization" "header" parameter is "Basic b3BlcmF0aW9uQW5hbHlzdDowcGVyYXRpMG5BbmFseXN9"
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	 	"userEmail" : "automated@script.com"
	}
    """
    When the "post" request is sent
    Then the status code will be "401"
    
    Scenario: 200 OK User Profile foound and set to Removed
    Given a request to "delete user profile" api on service "shared components"
    And the "Authorization" "header" parameter is "Basic b3BlcmF0aW9uQW5hbHlzdDowcGVyYXRpMG5BbmFseXN0"
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	 	"userEmail" : "automated@script.com"
	}
    """
    When the "post" request is sent
    Then the status code will be "200"
    
#     Scenario: Check Mongo to confirm user status has been marked as removed and all accounts linked to that user have a accountStatus of Removed.
#  	Given I search the users collection using email "nc1530@test.com"
#    Then the returned document should contain "removed"
#    
#     Scenario: Check Mongo to confirm users account status has been marked as removed.
#  	Given I search the accounts collection using userId "Thomas" and status "Removed"
#    Then the returned document should contain "Removed"
    

