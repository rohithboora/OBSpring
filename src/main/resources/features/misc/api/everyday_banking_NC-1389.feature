Feature: API - Create handler to manage timeline notifiable events

Scenario: POST to timeline ms to save events
    Given a request to "SaveEvent" api on service "timeline microservice" 
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
    """
{
  "userId": "BkNwMo43z",
  "events": [{
    "event": {
      "eventId": "Payday Cycle001",
      "name": "String",
      "notifiable": true,
      "sent": false,
      "transmitted": false,
      "eventType": "String",
      "frequency": "String",
      "rule": "String",
      "credit": true,
      "date": {
        "startDate": "2018-05-03T14:48:00",
        "endDate": "2018-05-03T14:48:00"
      },
      "insight": {
        "insightId": "String",
        "insightDescription": "String",
        "data": {"txnsId": "1000001", "ref":"12345678"}
      }
    }
  }]
}
	"""
	When the "post" request is sent
    Then the status code will be "200"
	Then the "userId" will be present on the response "payload" with value "BkNwMo43z"
	Then the "events" will be present on response "payload"
	Then the "_id" will be present on response "payload"
	
Scenario: Admin checks DB for the event in timelines collection 
	Given I search the "timelines" collection using field "userId" with value "BkNwMo43z" 
	Then the collection search should show event type "name" has been recorded and has a value of "Payday Cycle001"