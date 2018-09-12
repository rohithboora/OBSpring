@ui @regression
Feature: UI-NC1599-Welcome Screen Validation

  Scenario:
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    Then The screen should display the the following elements:
      | Welcome Header  |
      | Welcome Tagline |
      | Welcome Image   |
      | Login           |
      | Register        |