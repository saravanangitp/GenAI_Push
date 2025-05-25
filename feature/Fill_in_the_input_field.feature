Feature: Fill in the input field

  Scenario Outline: A scenario describing filling in the input field
    Given I open the webpage
    When I type <lastName> into the input field with id "lastName"
    Then I should see <lastName> in the input field with id "lastName"

  Examples:
    | lastName    |
    | "Doe"        |
    | "Smith"      |
    | "Johnson"    |