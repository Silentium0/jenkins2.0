Feature: create user

  @regression @smoke
  Scenario Outline: user validate items
    Given User login as "<Login>"
    Then validate "<items>"


    Examples:
      | Login      | items                                                                                               |
      | Advisor    | Home,Received docs,My uploads,Clients,Invitations,Users,Leads,Bookkeeping,1099 Form,Reconciliations |