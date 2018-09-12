Feature: Deploy audit MS NC-1240

Scenario: put request for creating User Registeration to Audit microservice
    Given a request to "CreateUserRegisteration" api on service "audit microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "userEmail" "payload" parameter is "m@d.com"
    And the "sessionId" "payload" parameter is "123456"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "auditId" will be present on response "payload"
    Then the "auditType" will be present on response "payload"
    Then the "serviceName" will be present on response "payload"
    
Scenario: put request for creating User Registeration to Audit microservice
    Given a request to "CreateLoginAudit" api on service "audit microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "userEmail" "payload" parameter is "m@d.com"
    And the "sessionId" "payload" parameter is "123456"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "auditId" will be present on response "payload"
    Then the "auditType" will be present on response "payload"
    Then the "serviceName" will be present on response "payload"
    
Scenario: put request for creating Add Account to Audit microservice
    Given a request to "CreateAddAccountAudit" api on service "audit microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "userEmail" "payload" parameter is "m@d.com"
    And the "sessionId" "payload" parameter is "123456"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "auditId" will be present on response "payload"
    Then the "auditType" will be present on response "payload"
    Then the "serviceName" will be present on response "payload"
    
Scenario: put request for creating Remove Account to Audit microservice
    Given a request to "CreateRemoveAccountAudit" api on service "audit microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the "userEmail" "payload" parameter is "m@d.com"
    And the "sessionId" "payload" parameter is "123456"
    When the "put" request is sent
    Then the status code will be "200"
    Then the "auditId" will be present on response "payload"
    Then the "auditType" will be present on response "payload"
    Then the "serviceName" will be present on response "payload"