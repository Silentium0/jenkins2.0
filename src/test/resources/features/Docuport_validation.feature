Feature: Docuport validation

  @DucuportValidation
  Scenario Outline: validate items
    Given login as "<User type>"
    When click on "My uploads"
    Then Validate Received docs ,search button, download button  is displayed
    When click "Received docs"
    Then Validate My uploads, download button, search button is displayed
    Then LogOut
    Examples:
      | User type  |
      | advisor    |
      | supervisor |
      | employee   |
