Feature: API-NC1219-Categorisation Schedule
# final logs will be in *categorisation-trigger in kibana
Scenario: The user adds an account no into the acconts micro service
	Given a request to "insertAccount" api on service "accounts microservice" 
	And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
     {

        "_id": "5a73818161fa232c1e6a1a70",

        "userId": "userId25",

        "account": {

               "nickname": "Suresh PCA",

               "accountNumber": "0234578091",

               "sortCode": "13-45-67",

               "accountId": "31820",

               "institution": "greenbank"

        }

    }
   """
    When the "put" request is sent
    Then the status code will be "200"
    Then the "n" will be present on the response "payload" with value "1"
    Then the "nModified" will be present on the response "payload" with value "1"
    Then the "ok" will be present on the response "payload" with value "1"
    
        
    
    Scenario:
	The post a trigger
	Given a request to "insertTrxnsEnrichmentId" api on service "accounts microservice" 
	And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
     {

    "accountId": "31820",

    "trxnsEnrichmentAccountId": "test"

}
   """
    When the "post" request is sent
    Then the status code will be "200"
  
    

