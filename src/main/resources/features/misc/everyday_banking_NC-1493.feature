Feature: Aggregated Spend Query

Scenario: User asks spend query 'How much have I spent in total'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| b2@b2.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much have I spent in total" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1129.10 from your connected account."
	
Scenario: User asks spend query 'Total spend 2 months ago'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| b2@b2.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Total spend 2 months ago" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "I am sorry, I am not yet trained to handle this query for those dates. Try asking for last month instead."
	
Scenario: User asks spend query 'Total spend last month'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| b2@b2.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Total spend last month" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1129.10 from your connected account."

Scenario: User asks spend query 'What is my total spending'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| b2@b2.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What is my total spending" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1129.10 from your connected account."

Scenario: User asks spend query 'Spend in total'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| b2@b2.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Spend in total" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1129.10 from your connected account."
	
Scenario: User asks spend query 'How much did I spend in total in April' single account
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| b2@b2.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much did I spend in total in April" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1129.10 from your connected account."
	
Scenario: User asks spend query 'What is my sum of my spending in January'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| b2@b2.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What is the sum of my spending in January" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "I am sorry, I am not yet trained to handle this query for those dates. Try asking for last month instead."
	
Scenario: User asks spend query 'What is my total spend' multiple accounts
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| h1@h1.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What is my total spend" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1830.54 across all your connected accounts."
	
Scenario: User asks spend query 'Total spend in April' multiple accounts
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| h1@h1.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Total spend in April" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1830.54 across all your connected accounts."
	
Scenario: User asks spend query 'What are my total expenses' multiple accounts
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| h1@h1.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What are my total expenses" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "Between 01-04-2018 and 30-04-2018, you have spent a total of £1830.54 across all your connected accounts."
	
Scenario: User asks spend query 'What is the sum of my spend in February' multiple accounts
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| h1@h1.com | Password1 |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What is the sum of my spend in February" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "I am sorry, I am not yet trained to handle this query for those dates. Try asking for last month instead."