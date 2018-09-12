Feature: API-NC1377-Deploy Timeline Microservice

Scenario: get request for Timeline microservice
    Given a request to "getTimelineMS" api on service "timeline microservice" 
    When the "get" request is sent
    Then the status code will be "200"
    
#Scenario: put request for Timeline microservice
    #Given a request to "getTimelineMS" api on service "timeline microservice" 
    #And the "Content-Type" "header" parameter is "application/json"
    #And the "rule" "payload" parameter is "Mock Rule"
    #And the "startDate" "payload" parameter is "2018-03-22T11:35:37.924Z"
    #And the "endDate" "payload" parameter is "2019-03-22T11:35:37.924Z"
    #When the "put" request is sent
    #Then the status code will be "200"
    #Then the "rule" will be present on response "payload"
    #Then the "userId" will be present on response "payload"
    #Then the "serviceName" will be present on response "payload"
    
#Scenario: post request for Timeline microservice
    #Given a request to "getTimelineMS" api on service "timeline microservice" 
    #When the "post" request is sent
    #Then the status code will be "200"
    