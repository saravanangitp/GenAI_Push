Feature: Add User

  Scenario Outline: A scenario describing adding a new user
    Given I open "https://thinking-tester-contact-list.herokuapp.com/addUser"
    When I see the header "Add User"
    Then I should see the header with class "genai-highlight genai-selected"

  Examples:
    | header     |
    | "Add User" |