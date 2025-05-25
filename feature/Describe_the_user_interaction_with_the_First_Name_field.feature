Feature: Describe the user interaction with the First Name field

  Scenario Outline: A scenario describing the user typing into the First Name field
    Given I open "https://thinking-tester-contact-list.herokuapp.com/addUser"
    When I type <firstName> into the First Name field
    Then I should see the typed <firstName> in the First Name field

  Examples:
    | firstName   |
    | "John"      |
    | "Emily"     |