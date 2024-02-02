Feature: The application should be running

  @smoke
  Scenario: simple search
    Given I am on the home page
    When I search for "glass teapot"
    Then I should see the results



  Scenario: another search
    Given I am on the home page
    When I search for "useless box"
    Then I should see more results








