Feature: Login Functionality
  Scenario: Validate successful login with valid credentials
    Given user nagigates to login page
    When user inters valid username
    And user inters valid Password
    Then user should login