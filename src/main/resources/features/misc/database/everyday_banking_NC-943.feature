Feature: Create audit event for log in NC-943

Scenario: As a user, when I log out, I want an auditable event to be created in the system.
Given I search the collection using the audit type "User Logout" and userId "rkfDqPfsM"
Then the collection search should show event type "log out" has been recorded and has a value of "User Logout"