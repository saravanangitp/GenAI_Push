Feature: Verify paragraph content

  Scenario Outline: A scenario describing verifying paragraph content
    Given I open the webpage
    When I verify the paragraph text as <paragraphText>
    And I verify the paragraph class as <paragraphClass>
    Then I should see the paragraph content

  Examples:
    | paragraphText                           | paragraphClass         |
    | "Created by Kristin Jackvony, Copyright 2021" | "genai-highlight genai-selected" |