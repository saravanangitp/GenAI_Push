Feature: Describe the paragraph element

  Scenario Outline: A scenario describing the paragraph text
    Given I open "unknown"
    When I see the paragraph with class "genai-highlight genai-selected"
    And I verify the paragraph text as "<paragraphText>"
    Then I should see the paragraph text

  Examples:
    | paragraphText                           |
    | Created by Kristin Jackvony, Copyright 2021 |