Feature: Modify accepted parameters for transaction endpoint NC-1143

#Session is now assigned to user, and cant be automated
Scenario: Send a POST request to /api/accountTransactions
    Given a request to "account transactions" api on service "shared components" 
    When the "post" request is sent
    And the "Content-Type" "header" parameter is "application/json"
    And the "bank" "payload" parameter is "nationwide"
    And the "token" "payload" parameter is "AAEkMDI4ODQ0ZjItODJhMS00NTRjLWEwNjUtNGQ0YzE0MGM1MmZkomCgNz91z7r3551cJCaljHVR6QEnlDvFNQreQRRzRthQUI_LkFTL19DQ5lgYUJVszgX34EcXRe5Vst3tYANOrT6UlUMWxL5D-KEU2sdblsM"
    And the "accountId" "payload" parameter is "17109552612"
    And the "dateFrom" "payload" parameter is "04/01/2018"
    When the "post" request is sent
    Then the status code will be "200"
    Then the "Data.Transaction" will be present on response "payload"

    
    