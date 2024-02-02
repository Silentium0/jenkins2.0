Feature: The application should be running


  Scenario: simple search
    Given I am on the home page
    When I search for "glass teapot"
    Then I should see the results


  @smoke
  Scenario: another search
    Given I am on the home page
    When I search for "useless box"
    Then I should see more results








