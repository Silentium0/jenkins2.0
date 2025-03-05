Feature: create user

  @regression @smoke @wip
  Scenario Outline: user validate items
    Given User login as "<Login>"
    Then validate "<items>"
    Then user click "Clients"
    Then user click "Create new client"
    Then user click "Personal"
    Then user click checkbox
    Then create new client
      | First Name       | Mike           |
      | Last Name        | Smith          |
      | Email            | Mike@gmail.com |
      | Phone            | 123456543      |
      | Password         | Mike12345      |
      | Confirm password | Mike12345      |
      | Advisor          |                |
    Then user click "Save"
    Examples:
      | Login   | items                                                                                               |
      | Advisor | Home,Received docs,My uploads,Clients,Invitations,Users,Leads,Bookkeeping,1099 Form,Reconciliations |