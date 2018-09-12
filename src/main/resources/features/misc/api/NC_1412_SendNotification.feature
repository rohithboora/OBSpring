Feature: Push Notifications Trigger - Resend failed push notifications to OneSignal NC-1412 (Requests to Notifications Handler)

Scenario: post request for sendNotifications when you send a notification object should return a 200
    Given a request to "send notifications" api on service "notifications handler microservice"
    And the "Content-Type" "header" parameter is "application/json"
    And the "userId" "payload" parameter is "automated@script.com"
    And the "title" "payload" parameter is "Test Notification"
    And the "description" "payload" parameter is "This is a test notification"
    And the "token" "payload" parameter is "device-token"
    And the "_id" "payload" parameter is "5abb667fbeaf1a4be0a32792"
    When the "post" request is sent
    Then the status code will be "200"

Scenario: post request for sendNotifications when you send a notification object without an _id should return a 400
    Given a request to "send notifications" api on service "notifications handler microservice"
    And the "Content-Type" "header" parameter is "application/json"
    And the "userId" "payload" parameter is "automated@script.com"
    And the "title" "payload" parameter is "Test Notification"
    And the "description" "payload" parameter is "This is a test notification"
    And the "token" "payload" parameter is "device-token"
    When the "post" request is sent
    Then the status code will be "400"
    
Scenario: post request for sendNotifications when you do not send a payload should return a 400
    Given a request to "send notifications" api on service "notifications handler microservice"
    And the "Content-Type" "header" parameter is "application/json"
    When the "post" request is sent
    Then the status code will be "400"
