@ui @regression
Feature: UI-NC970-Validate all the elements/labels on register page:

  Scenario: User clicks register, is taken to the personal details screen.
    Given authenticate with email "a@a.com" and password "123"
    When A user access "welcome" section of "everyday banking" application
    And A user clicks the "register" button on the "welcome" page
    And A user is redirected to the "register" page
    Then The screen should display the the following elements:
      | your first name label    |
      | your first name field    |
      | your surname label       |
      | your surname field       |
      | your email address label |
      | your email address field |
      | set password label       |
      | set password field       |
      | confirm password label   |
      | confirm password field   |
      | next button              |
      | already registered link  |
