Feature: API-NC1390-Move device related code to its own microservice

#Scenario: PUT request with userId and Device token to Device Microservice
#    Given a request to "device" api on service "device microservice"
#    And the "Content-Type" "header" parameter is "application/json"
#    And the payload is
#    """
#   {
#	"userId":"12345",
#	"device": {
#			"pushToken": "8515df72-822a-4996-90fd-9732fa9c707f"
#		}
#	}
#	 """
#    When the "put" request is sent
#    Then the status code will be "200"
#    Then the "_id" will be present on response "payload"
#    Then the "userId" will be present on the response "payload" with value "12345"
#    Then the "__v" will be present on response "payload"
#    Then the "createdAt" will be present on response "payload"
#    Then the "token" will be present on the response "payload" with value "8515df72-822a-4996-90fd-9732fa9c707f"
#    Then the "updatedAt" will be present on response "payload"
    
Scenario: POST request to Device Microservice
    Given a request to "device" api on service "device microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
   {
	"userId":"12345"
	} 
	 """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "userId" will be present on the response "payload" with value "12345"
    Then the "token" will be present on the response "payload" with value "8515df72-822a-4996-90fd-9732fa9c707f"
    Then the "token" will be present on the response "payload" with value "8515df72-822a-4996-90fd-9732fa9c707f"