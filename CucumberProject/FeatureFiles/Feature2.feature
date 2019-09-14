Feature: As a user I want to test login feature with multiple data sets
  I want to use this template for my feature file

  Scenario Outline: To test login scenario with multiple data sets
    Given Application is up & running
    When I enter <username> & <password> on login page
    Then I should be logged in successfully

    Examples: 
      | username      | password |
      | rutujainamdar | test@acv |
      | rutujabcdd    | temp@sef |
      | rutujata      | test@a   |
      | rutujatb      | temp@b   |
      | rutujatc      | test@123   |
