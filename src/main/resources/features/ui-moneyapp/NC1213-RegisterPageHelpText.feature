@ui @regression
Feature: UI-NC1213-Register page help text validation

  Scenario: User is on Confirm details page and click confirm taken to T&C page
    Given authenticate with email "a@a.com" and password "123"
    Given A user access "welcome" section of "everyday banking" application
    When A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    And The screen should display the the following elements:
      | passwordtext |
    Then The screen should display the following text: "Help text"
