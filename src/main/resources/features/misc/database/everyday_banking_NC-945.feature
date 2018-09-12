Feature: Create audit event for remove account NC-945

Scenario: As a user, when I remove account, I want an auditable event to be created in the system.
Given I search the collection using the audit type "Remove account" and email "nc945@test.com"
Then the collection search should show event type "removed account" has been recorded and has a value of "Remove account"