Feature: Create an audit event for version of data request screen

Scenario: Audit event created once user accepts the DR screen before connecting account
	Given I search the "audits" collection using field "userId" with value "123456" 
	Then the collection search should show event type "auditId" has been recorded and has a value of "DR001"