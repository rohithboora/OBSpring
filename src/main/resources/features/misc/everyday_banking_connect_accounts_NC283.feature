@ignore
Feature: A users ConnectAccounts journey in everydaybanking NC283

Scenario: A user tries to ConnectAccounts in everyday banking applicaiton 
	Given A user access "welcome" section of "everyday banking" application 
	When A user clicks the "login" button on the "welcome" page 
	Then A user is redirected to the "login" page 
	Then A user enters "nc283@test.com" in "email" field on the "login" page 
	Then A user enters "password1234" in "password" field on the "login" page 
	When A user clicks the "log me in" button on the "login" page 
	Then A user is redirected to the "chatbot" page 
	When A user clicks the "connect account" button on the "chatbot" page 
	Then A user is redirected to the "select-provider" page 
	When A user clicks the "nationwide" button on the "select-provider" page 
	When A user clicks the "next" button on the "select-provider" page 
	Then A user is redirected to the "openbanking-auth" page 
	Then A user enters "01234580" in "customer number" field on the "openbanking-auth" page 
	When A user clicks the "remember customer number" button on the "select-provider" page 
	Then A user enters "s" in "box1" field on the "openbanking-auth" page 
	Then A user enters "@" in "box2" field on the "openbanking-auth" page 
	Then A user enters "3" in "box3" field on the "openbanking-auth" page 
	When A user clicks the "sms" button on the "openbanking-auth" page 
	Then A user enters "123456" in "mobile number" field on the "openbanking-auth" page 
	Then A user enters "1234" in "one-time passcode" field on the "openbanking-auth" page 
	When A user clicks the "log in" button on the "openbanking-auth" page 
	Then A user is redirected to the "account-share-auth" page 
	When A user clicks the "joint account" button on the "account-share-auth" page 
	When A user clicks the "authorise" button on the "account-share-auth" page 
	Then A user is redirected to the "account-share-auth" page 
	When A user clicks the "home" button on the "chatbot" page 
	When A user clicks the "account overview" button on the "chatbot" page 
	Then A user is redirected to the "account-overview" page 

