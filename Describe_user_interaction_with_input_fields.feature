Feature: Describe user interaction with input fields

  Scenario Outline: A scenario describing user interaction with input fields
    Given I open the webpage
    When I type <firstName> into the First Name field
    And I type <password> into the Password field
    Then I should see the input fields populated

  Examples:
    | firstName | password |
    | "John"    | "12345" |
    | "Jane"    | "67890" |