Feature: Connect Account - Proposition redirect endpoint [Shared Components]

Scenario: Trigger Transaction refresh with correct account no
    Given a request to "accounts account" api on service "accounts microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
   {
	"obacBankId":"12345",
	"authorisationCode":"authcode",
	"userId":"r1L5SHfjM"
	} 
	 """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "obacAccountId" will be present on response "payload"
    Then the "aspspAccountId" will be present on response "payload"

Scenario: As a developer, I want to check that aspspAccountId and obacAccountId exist in the DB for a user 
Given the collection "accounts" by userId with value "r1L5SHfjM" should return field "aspspAccountId"
Given the collection "accounts" by userId with value "r1L5SHfjM" should return field "obacAccountId"
