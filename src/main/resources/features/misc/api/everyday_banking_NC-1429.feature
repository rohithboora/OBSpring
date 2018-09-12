Feature: Connect Account - Generate ASPSP redirectURL

Scenario: Verify the response from accounts microservice post OBAC integration
    Given a request to "accountsasip" api on service "accounts microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	"userId": "123456",	
	"address": "http://eb.34.249.167.244.xip.io"
	}
    """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "body.Data" will be present on response "payload"
    Then the "statusCode" will be present on the response "payload" with value "201"