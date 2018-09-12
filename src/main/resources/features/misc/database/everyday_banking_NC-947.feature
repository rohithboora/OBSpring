Feature: Create audit event for user registration NC-947

Scenario: As a user, when register, I want an auditable event to be created in the system.
Given I search the collection using the audit type "User Registration" and email "nc947@test.com"
Then the collection search should show event type "user registration" has been recorded and has a value of "User Registration"