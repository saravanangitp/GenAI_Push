Feature: Describe the interaction with the given DOM structure

Scenario Outline: A scenario describing the interaction with the submit button
  Given I open the webpage with the submit button
  When I click the submit button with id "submit"
  Then I should see the outcome of clicking the submit button

Examples:
  | submitButtonId |
  | "submit"       |