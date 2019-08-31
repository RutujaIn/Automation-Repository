Feature: As user I want to use test login feature

  Scenario: To test login scenario with valid credentials
    Given Application is up & running 
    When I enter valid credentials
    Then I should be logged in successfully
