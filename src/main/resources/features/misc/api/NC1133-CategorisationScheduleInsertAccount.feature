Feature: API-NC1133-Categorisation Schedule

Scenario:
The user adds an account no into the acconts micro service
	Given a request to "insertAccount" api on service "accounts microservice" 
	And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
     {

        "_id": "5a73818161fa232c1e6a1a70",

        "userEmail": "n.f@test.com",

        "account": {

               "nickname": "Suresh PCA",

               "accountNumber": "02345641",

               "sortCode": "13-45-67",

               "accountId": "17109552299",

               "institution": "redbank"

        }

    }
   """
    When the "put" request is sent
    Then the status code will be "200"
    Then the "n" will be present on the response "payload" with value "1"
    Then the "nModified" will be present on the response "payload" with value "1"
    Then the "ok" will be present on the response "payload" with value "1"


   Scenario: The user retrive getAccountByUser/n.f@test.com an account id in everyday banking
	Given a request to "getAccountByUser" api on service "accounts microservice"
	And the "Accept" "header" parameter is "application/json"
	And the "email" "path" parameter is "n.f@test.com"
	When the "get" request is sent
	Then the status code will be "200"
	Then the "accountNumber" will be present on response "payload"
    
   
