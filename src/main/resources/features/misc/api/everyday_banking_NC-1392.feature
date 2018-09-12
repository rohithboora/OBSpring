Feature: API - Implement get email notification microservice NC-1392

Scenario: POST request to Mailer Microservice
Given a request to "mailer Service" api on service "mailer microservice"
And the "Content-Type" "header" parameter is "application/json"
And the payload is
"""
   {
"email": "teamogawun@gmail.com",
"locals": {
    "resetLink": "http://nationwide.co.uk/resetpassowrd/token"
    }
}
	 """
When the "post" request is sent
Then the status code will be "200"

  Scenario: POST request to Mailer Microservice for empty email
    Given a request to "mailer Service" api on service "mailer microservice"
    And the "Content-Type" "header" parameter is "application/json"
    And the payload is
"""
   {
"email": "",
"locals": {
    "resetLink": "http://nationwide.co.uk/resetpassowrd/token"
    }
}
	 """
    When the "post" request is sent
    Then the status code will be "400"