Feature: Describe the input field feature

Scenario Outline: A scenario describing filling the input field
  Given I open the webpage
  When I type <firstName> into the First Name field
  Then I should see the input field filled with <firstName>

Examples:
  | firstName   |
  | "John"      |
  | "Alice"     |