Feature: Add User

  Scenario Outline: A scenario describing adding a user
    Given I see the header "Add User" with class "genai-highlight genai-selected"
    When I verify the header text is "Add User"
    And I check the header has class "genai-highlight"
    And I check the header has class "genai-selected"
    Then I should see the header displayed

  Examples:
    | headerText   | class1        | class2       |
    | "Add User"   | "genai-highlight" | "genai-selected" |