Feature: Row validation
  @row
  Scenario: Docuport Row Validation
    Given user login as "advisor"
    When Click leads
    And Validate that Rows per page shows by default 10
    And change rows per page to 5
    And Click Users
    And validate that Rows per page shows by default 10
    And change rows per page to 5
    And Validate that after changing it is showing 5

