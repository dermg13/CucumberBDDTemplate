Feature: T-Shirts page related scenarios

  Background: Given User opens url of homepage

  @US004d
  Scenario Outline: Verify link texts under My account footer are displayed
    When User clicks on "T-shirts" button
    Then Verify the following "<link texts>" are displayed
    Examples:
      | link texts       |
      | My orders        |
      | My credit slips  |
      | My addresses     |
      | My personal info |


