Feature: Describe paragraph content

  Scenario Outline: A scenario describing paragraph verification
    Given I open the webpage
    When I see the paragraph with class "genai-highlight genai-selected"
    And I verify the paragraph text is "<paragraphText>"
    Then I should see the paragraph with the specified class and text

  Examples:
    | paragraphText                                   |
    | "Created by Kristin Jackvony, Copyright 2021"    |