Feature: API-1527-Create endpoint in Audit event micro-service to retrieve all audit events

Scenario: Get all audit data between certain time frame
    Given a request to "retrieve audits" api on service "authenticated audit microservice"
    And the "dateFrom" "path" parameter is "2018-04-02T08:50:55.370Z"
    And the "dateTo" "path" parameter is "2018-04-04T08:50:55.370Z"
    And the "Content-Type" "header" parameter is "application/json"
	When the "get" request is sent
    Then the status code will be "200"
	Then the "_id" will be present on response "payload"
	Then the "auditId" will be present on response "payload"
	Then the "auditType" will be present on response "payload"
	Then the "timestamp" will be present on response "payload"
	Then the "userId" will be present on response "payload"
	
Scenario: pGet all audit data between a longer certain time frame
    Given a request to "retrieve audits" api on service "authenticated audit microservice"
    And the "dateFrom" "path" parameter is "2018-01-01T08:50:55.370Z"
    And the "dateTo" "path" parameter is "2018-05-02T08:50:55.370Z"
    And the "Content-Type" "header" parameter is "application/json"
	When the "get" request is sent
    Then the status code will be "200"
	Then the "_id" will be present on response "payload"
	Then the "auditId" will be present on response "payload"
	Then the "auditType" will be present on response "payload"
	Then the "timestamp" will be present on response "payload"
	Then the "userId" will be present on response "payload"