Feature: Describe the sign up feature

  Scenario Outline: A scenario describing the sign up process
    Given I open the sign up page
    When I see the sign up message as <message>
    Then I should see the sign up message

  Examples:
    | message                             |
    | Sign up to begin adding your contacts! |