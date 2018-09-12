Feature: (Categorisation) eWise: Create new eWise user per user bank account NC-1223

Scenario: Generate new eWise ID
    Given a request to "Generate new eWise id" api on service "shared components" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "userId" "payload" parameter is "100000001"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "userId" will be present on the response "payload" with value "10000001"
    Then the "newUserId" will be present on response "payload"
    Then the "trxnsEnrichmentId" will be present on response "payload"
    
