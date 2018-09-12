Feature: Aggregated categotised spend query

Scenario: User asks spend query 'How much have I spent in Eating out'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much have I spent in Eating out" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Eating Out"
	
Scenario: User asks spend query 'How much have I spent in Rent'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much have I spent in Rent" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Mortgage/Rent"
	
Scenario: User asks spend query 'How much have I spent in Household bills'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much have I spent in Household bills" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Household Bills"
	
Scenario: User asks spend query 'How much have I spent in shopping'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much have I spent in Shopping" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Shopping"
	
Scenario: User asks spend query 'How much have I spent in travel'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much have I spent in Travel" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Travel"
	
Scenario: User asks spend query 'How much have I spent in Groceries'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much have I spent in Groceries" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Groceries"
	
Scenario: User asks spend query 'Tell me about my spending'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Tell me about my spending" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Eating Out"
	
Scenario: User asks spend query 'What did I spend my money on in April'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What did I spend my money on in April" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user is redirected to the "transactions" page
	Then A user should see "Last Month"
	Then A user should see "Eating Out"
	
Scenario: User asks spend query 'What did I spend my money on in January'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What did I spend my money on in January" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "I am sorry, I am not yet trained to handle this query for those dates. Try asking for last month instead."
	
Scenario: User asks spend query 'Where is my money going?'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "Where is my money going?" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user should see "Last Month"
	Then A user should see "Eating Out"
	
Scenario: User asks spend query 'How much did I spend on food?'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much did I spend on food?" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user should see "Last Month"
	Then A user should see "Eating Out"
	
Scenario: User asks spend query 'What is the breakdown of my spending'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "What is the breakdown of my spending" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user should see "Last Month"
	Then A user should see "Eating Out"
	
Scenario: User asks spend query 'How much did i spend on bills last month'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much did I spend on bills last month" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then A user should see "Last Month"
	Then A user should see "Household Bills"
	
Scenario: User asks spend query 'How much did I spend shopping in February'
	Given A user access "welcome" section of "everyday banking" application
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	When A user enters credentials on page 
		| g1@g1.com | Password1! |
	Then A user is redirected to the "chatbot" page 
	Then A user enters "How much did I spend shopping in February" in "chatinput" field on the "chatbot" page 
	When A user clicks the "sendchat" button on the "chatbot" page 
	Then The screen should display the last message as text: "I am sorry, I am not yet trained to handle this query for those dates. Try asking for last month instead."

	