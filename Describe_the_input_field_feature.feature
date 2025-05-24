Feature: Describe the input field feature

Scenario Outline: A scenario describing filling the input field
  Given I open "https://thinking-tester-contact-list.herokuapp.com/addUser"
  When I type <lastName> into the Last Name field
  Then I should see the input field is filled with <lastName>

Examples:
  | lastName   |
  | "Doe"      |
  | "Smith"    |