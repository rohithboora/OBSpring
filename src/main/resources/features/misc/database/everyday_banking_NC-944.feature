Feature: Create audit event for add account BR069 NC-944

Scenario: As a user, when I add an account, I want an auditable event to be created in the system.
Given I search the collection using the audit type "Remove account" and email "g.d@accenture.com"
Then the collection search should show event type "removed account" has been recorded and has a value of "Remove account"