Feature: API - Account Handler: Implement handler for communications to get new transactions NC-1275

Scenario: Trigger Transaction refresh with correct account no
    Given a request to "triggerTransactionRefresh" api on service "transaction refresh microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
   {
	"accountId": "31820",
	"institution": "nationwide",
	"consent": {
		"token": "AAEkMDI4ODQ0ZjItODJhMS00NTRjLWEwNjUtNGQ0YzE0MGM1MmZkF-uPrKnyjWo_UROqIGHdbpnQmSSI3u2kr-hl8y1C3dGHGpz3XWLhqtkzmZhgVk477RtSaMkTwOPMlSMB7XRLkEiTBHDQdPPFJ0GGgCxir0Q"
		},
	"lastSuccessfulTransactionsRefresh": 1521603876508
	} 
	 """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "message" will be present on the response "payload" with value "The service marked the transaction refresh as complete"

 
 Scenario: Trigger transaction refresh with incorrect account no
    Given a request to "triggerTransactionRefresh" api on service "transaction refresh microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
   {
	"accountId": "31000",
	"institution": "nationwide",
	"consent": {
		"token": "AAEkMDI4ODQ0ZjItODJhMS00NTRjLWEwNjUtNGQ0YzE0MGM1MmZkF-uPrKnyjWo_UROqIGHdbpnQmSSI3u2kr-hl8y1C3dGHGpz3XWLhqtkzmZhgVk477RtSaMkTwOPMlSMB7XRLkEiTBHDQdPPFJ0GGgCxir0Q"
		},
	"lastSuccessfulTransactionsRefresh": 1521603876508
	} 
	 """
    When the "post" request is sent
    Then the status code will be "500"
    Then the "error" will be present on the response "payload" with value "No transactions returned from transaction OB API"

