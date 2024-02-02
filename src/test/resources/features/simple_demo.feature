Feature: The application should be running


  Scenario: simple search
    Given I am on the home page
    When I search for "glass teapot"
    Then I should see the results



  Scenario: another search
    Given I am on the home page
    When I search for "useless box"
    Then I should see more results

  @test1
  Scenario: Login as a advisor
    When user enter username for advisor
    And user enter password for advisor
    And  user  click login button









