Feature: Add User

  Scenario Outline: A scenario describing adding a new user
    Given I open "https://thinking-tester-contact-list.herokuapp.com/addUser"
    When I type <firstName> into the First Name field
    And I type <lastName> into the Last Name field
    And I type <email> into the Email field
    And I type <password> into the Password field
    And I click the Submit button
    Then I should see a confirmation message

  Examples:
    | firstName | lastName | email          | password |
    | John      | Doe      | johndoe@example| pass123  |
    | Jane      | Doe      | janedoe@example| pass123  |