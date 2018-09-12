Feature: API-NC1226-(Categorisation) Accounts MS: Retrieve an account that requires transactions to be categorised

Scenario: User sends request to an account which has mapped category null
    Given a request to "getTransactionsForCategorisation" api on service "transaction microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	 "accountId" : "44444"
	}
    """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "mappedCategory" will be present on response "payload"
 
    
    
Scenario: User sends request to an account which has mapped category blank
    Given a request to "getTransactionsForCategorisation" api on service "transaction microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	 "accountId" : "44444"
	}
    """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "mappedCategory" will be present on response "payload"
    
Scenario: User sends request to an account which has mapped category as some categorised
    Given a request to "getTransactionsForCategorisation" api on service "transaction microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	 "accountId" : "4444421"
	}
    """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "" will be present on response "payload"
 
 ###### below scripts will add data in for testing the above the scripts   
 
Scenario: To add the data of account to be tested with mapped category null
	Given a request to "put transactions api" api on service "transaction microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
	"""
	{
                "Transaction": {
                    "AccountId": "44444",
                    "TransactionId": "6666",
                    "TransactionReference": "Ref 1234",
                    "Amount": {
                        "Amount": "10.00",
                        "Currency": "GBP"
                    },
                    "CreditDebitIndicator": "Credit",
                    "Status": "Booked",
                    "BookingDateTime": "2017-04-05T10:45:22+00:00",
                    "ValueDateTime": "2017-04-05T10:45:22+00:00",
                    "TransactionInformation": "Cash from Aubrey",
                    "BankTransactionCode": {
                        "Code": "ReceivedCreditTransfer",
                        "SubCode": "DomesticCreditTransfer"
                    },
                    "ProprietaryBankTransactionCode": {
                        "Code": "Transfer",
                        "Issuer": "AlphaBank"
                    },
                    "Balance": {
                        "Amount": {
                            "Amount": "230.00",
                            "Currency": "GBP"
                        },
                        "CreditDebitIndicator": "Credit",
                        "Type": "InterimBooked"
                    },
                    "enrichmentCategory": "",
                    "MappedCategory": null
                }
}
	
	"""
    When the "put" request is sent
    Then the status code will be "200"



Scenario: To add the data of account to be tested with mapped category added
	Given a request to "put transactions api" api on service "transaction microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
	"""
	{
                "Transaction": {
                    "AccountId": "44444",
                    "TransactionId": "6666",
                    "TransactionReference": "Ref 1234",
                    "Amount": {
                        "Amount": "10.00",
                        "Currency": "GBP"
                    },
                    "CreditDebitIndicator": "Credit",
                    "Status": "Booked",
                    "BookingDateTime": "2017-04-05T10:45:22+00:00",
                    "ValueDateTime": "2017-04-05T10:45:22+00:00",
                    "TransactionInformation": "Cash from Aubrey",
                    "BankTransactionCode": {
                        "Code": "ReceivedCreditTransfer",
                        "SubCode": "DomesticCreditTransfer"
                    },
                    "ProprietaryBankTransactionCode": {
                        "Code": "Transfer",
                        "Issuer": "AlphaBank"
                    },
                    "Balance": {
                        "Amount": {
                            "Amount": "230.00",
                            "Currency": "GBP"
                        },
                        "CreditDebitIndicator": "Credit",
                        "Type": "InterimBooked"
                    },
                    "enrichmentCategory": "",
                    "MappedCategory": "some category"
                }
}
	
	"""
    When the "put" request is sent
    Then the status code will be "200"
    
    
   Scenario: To add the data of account to be tested with blank
	Given a request to "put transactions api" api on service "transaction microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
	"""
	{
                "Transaction": {
                    "AccountId": "444423344",
                    "TransactionId": "6666",
                    "TransactionReference": "Ref 1234",
                    "Amount": {
                        "Amount": "10.00",
                        "Currency": "GBP"
                    },
                    "CreditDebitIndicator": "Credit",
                    "Status": "Booked",
                    "BookingDateTime": "2017-04-05T10:45:22+00:00",
                    "ValueDateTime": "2017-04-05T10:45:22+00:00",
                    "TransactionInformation": "Cash from Aubrey",
                    "BankTransactionCode": {
                        "Code": "ReceivedCreditTransfer",
                        "SubCode": "DomesticCreditTransfer"
                    },
                    "ProprietaryBankTransactionCode": {
                        "Code": "Transfer",
                        "Issuer": "AlphaBank"
                    },
                    "Balance": {
                        "Amount": {
                            "Amount": "230.00",
                            "Currency": "GBP"
                        },
                        "CreditDebitIndicator": "Credit",
                        "Type": "InterimBooked"
                    },
                    "enrichmentCategory": "",
                    "MappedCategory": "some category"
                }
}
	
	"""
    When the "put" request is sent
    Then the status code will be "200"
