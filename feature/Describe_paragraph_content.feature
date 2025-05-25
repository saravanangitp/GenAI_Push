Feature: Describe paragraph content

  Scenario Outline: A scenario describing paragraph text verification
    Given I open the webpage
    When I find a paragraph with class "genai-highlight"
    And I verify the paragraph also has class "genai-selected"
    And I check the paragraph text is "<paragraphText>"
    Then I should see the paragraph text as expected

  Examples:
    | paragraphText                                    |
    | "Created by Kristin Jackvony, Copyright 2021"     |