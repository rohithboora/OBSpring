Feature: (Categorisation) eWise: Categorise Transactions NC-1224

Scenario: Generate new eWise ID for categorisation for income transaction
    Given a request to "categoriseTransactions" api on service "shared components" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	"accountId": "10000002",
	"trxnsEnrichmentId": "36df6e18-eb87-5e8d-b006-94dcb38cd070",
	"transactions": [
	   {
	      "accountId": "10000002",
	      "transactionId": "F470F60",
	      "amount": {
	         "amount": 1900
	      },
	      "description": "S KUMAR SALARY",
	      "status": "Booked",
	      "creditDebitIndicator": "",
	      "dateTime": {
	         "bookingDate": "2017-11-30T18:41:23.000Z",
	         "valueDate": "2017-11-30T14:10:03.000Z"
	      },
	      "transactionCode": {
	         "subCode": "StandingOrder",
	         "code": "ReceivedCreditTransfer"
	      },
	      "merchantDetails": {
	         "name": "",
	         "merchantCategoryCode": ""
	      },
	      "proprietaryTransactionCode": {
	         "code": ""
	      },
	      "balance": {
	         "amount": 3075.57,
	         "creditDebitIndicator": "Credit",
	         "type": "Running Balance",
	         "currency": "GBP"
	      }
	   }
]
	}
    """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "accountId[0]" will be present on the response "payload" with value "10000002"
    Then the "enrichmentCategory" will be present on response "payload"
    Then the "mappedCategory[0]" will be present on the response "payload" with value "Income"
    
    
    
Scenario: Generate new eWise ID for categorisation for multiple transactions
    Given a request to "categoriseTransactions" api on service "shared components" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
    {
	"accountId": "10000003",
	"trxnsEnrichmentId": "36df6e18-eb87-5e8d-b006-94dcb38cd070",
	"transactions": [
    	   {
	      "accountId": "10000003",
	      "transactionId": "W419A55",
	      "amount": {
	         "amount": 45
	      },
	      "description": "SYSTEM ONE TRAVEL",
	      "status": "Booked",
	      "creditDebitIndicator": "",
	      "dateTime": {
	         "bookingDate": "2017-12-01T10:30:48.000Z",
	         "valueDate": "2017-12-02T15:52:31.000Z"
	      },
	      "transactionCode": {
	         "subCode": "DirectDebitPayment",
	         "code": "IssuedDirectDebit"
	      },
	      "merchantDetails": {
	         "name": "",
	         "merchantCategoryCode": ""
	      },
	      "proprietaryTransactionCode": {
	         "code": ""
	      },
	      "balance": {
	         "amount": 4280.57,
	         "creditDebitIndicator": "Credit",
	         "type": "Running Balance",
	         "currency": "GBP"
	      }
	   },
	   {
	      "accountId": "10000003",
	      "transactionId": "G588D64",
	      "amount": {
	         "amount": 29
	      },
	      "description": "VOFAFONE  LIMITED (CCA) NEWBURY",
	      "status": "Booked",
	      "creditDebitIndicator": "",
	      "dateTime": {
	         "bookingDate": "2017-12-15T11:17:45.000Z",
	         "valueDate": "2017-12-16T06:10:55.000Z"
	      },
	      "transactionCode": {
	         "subCode": "DirectDebitPayment",
	         "code": "IssuedDirectDebit"
	      },
	      "merchantDetails": {
	         "name": "",
	         "merchantCategoryCode": ""
	      },
	      "proprietaryTransactionCode": {
	         "code": ""
	      },
	      "balance": {
	         "amount": 2910.6,
	         "creditDebitIndicator": "Credit",
	         "type": "Running Balance",
	         "currency": "GBP"
	      }
	   },
	   {
	      "accountId": "10000003",
	      "transactionId": "E819T93",
	      "amount": {
	         "amount": 8.99
	      },
	      "description": "NETFLIX.COM NEW YORK CITY",
	      "status": "Booked",
	      "creditDebitIndicator": "",
	      "dateTime": {
	         "bookingDate": "2017-12-15T17:34:45.000Z",
	         "valueDate": "2017-12-15T21:31:12.000Z"
	      },
	      "transactionCode": {
	         "subCode": "DirectDebitPayment",
	         "code": "IssuedDirectDebit"
	      },
	      "merchantDetails": {
	         "name": "",
	         "merchantCategoryCode": ""
	      },
	      "proprietaryTransactionCode": {
	         "code": ""
	      },
	      "balance": {
	         "amount": 2964.59,
	         "creditDebitIndicator": "Credit",
	         "type": "Running Balance",
	         "currency": "GBP"
	      }
	      
	      }
]
	}
    """
    When the "post" request is sent
    Then the status code will be "200"
    Then the "accountId[0]" will be present on the response "payload" with value "10000003"
    Then the "enrichmentCategory" will be present on response "payload"
    Then the "mappedCategory[0]" will be present on the response "payload" with value "Travel"   
    Then the "mappedCategory[1]" will be present on the response "payload" with value "Household Bills"   
    Then the "mappedCategory[2]" will be present on the response "payload" with value "Shopping"     
