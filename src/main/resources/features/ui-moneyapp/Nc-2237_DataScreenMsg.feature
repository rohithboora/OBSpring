@ui @regression
Feature: UI-NC2237-Validate labels on Data request screen

  Scenario: The user navigates to chatbot and adds account and in data request screen must see test message
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    And A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And A user enters "Home" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user clicks the "account overview" button on the "chatbot" page
    And A user is redirected to the "account-overview" page
    And A user clicks the "add" button on the "account-overview" page
    And A user is redirected to the "select-provider" page
    And A user clicks the "nationwide" button on the "select-provider" page
    And A user is redirected to the "data-request" page
    And A user should see "help1" with text
	  """
	  Please note, we do not ask you to provide special category data. However, it is possible that your account and transaction data may reveal this data, which is subject to special protection under data privacy legislation.
	  """
    And A user should see "help2" with text
	  """
	  No analysis or other use of the following characteristics will be made by Nationwide if they are revealed by the transaction data obtained as part of the service: racial or ethnic origin, political opinions, religious or philosophical beliefs, criminal convictions and offences, trade union membership, genetic data, biometric data, health, sex life or sexual orientation.
	  """
    And A user should see "help3" with text
	  """
	  If you do not want Nationwide to process this data, you should not connect your accounts
	  """
    And A user clicks the "Cancel" button on the "data-request" page
    Then A user is redirected to the "select-provider" page