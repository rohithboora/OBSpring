@ui @bug
Feature: UI-NC1339-Validate Timestamp on Account Overview Page

  Scenario: The user navigates account overview and wants to validate the pattern of timestamp under the account
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "login" button on the "welcome" page
    And A user is redirected to the "login" page
    When A user enters credentials on page
      | testauto@nw.com | Password@12 |
    And A user is redirected to the "chatbot" page
    And The screen should display the last message as text: "Home"
    And A user enters "Home" in "chatinput" field on the "chatbot" page
    And A user clicks the "sendchat" button on the "chatbot" page
    And A user clicks the "account overview" button on the "chatbot" page
    And A user is redirected to the "account-overview" page
    And A user should see a "remove account" button on "account-overview" page
    Then A user should see the Timestamp format on "account-overview" page