Feature: API - Implement get device in notification microservice NC-1391

Scenario: POST request to notifications microservice to retrieve device token.
    Given a request to "getUserDeviceToken" api on service "notifications handler microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
   {
	"userId":"r1L5SHfjM"
	} 
	 """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "token" will be present on the response "payload" with value "8515df72-822a-4996-90fd-9732fa9c707f"
    
Scenario: POST request to notifications microservice when no device token is found
    Given a request to "getUserDeviceToken" api on service "notifications handler microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
   {
	"userId":"DoesNotExist123"
	} 
	 """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "error" will be present on the response "payload" with value "No device found"