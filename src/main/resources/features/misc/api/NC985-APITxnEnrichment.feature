Feature: API-NC985-Implement wrapper API for eWise - remove user data

Scenario: delete request for Categorization microservice
    Given a request to "transactionEnrichment" api on service "categorisation microservice" 
     And the "trxnsEnrichmentUserId" "path" parameter is "683437c0-5f93-5587-94c0-41c9f0d04969"
     And the "trxnsEnrichmentAccountId" "path" parameter is "4c970401-712f-54af-a2dc-e3d822b8a09c"
    When the "delete" request is sent
    Then the status code will be "404"