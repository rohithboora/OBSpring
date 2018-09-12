Feature: Create own unique identifier for Users

Scenario: User, records gets new uniqueKey in the chathistories collection
 Given I search the "chathistories" collection using field "userId" with value "SkOKvO5qM"

	
Scenario:
User checks for accounts collection
Given I search the "accounts" collection using field "userId" with value "r1ZInPqcf"


Scenario:
User checks for balances collection
Given I search the "balances" collection using field "accountId" with value "17109552612888888"


Scenario:
User checks for audit collection
Given I search the "audits" collection using field "userId" with value "r1ZInPqcf"


    
