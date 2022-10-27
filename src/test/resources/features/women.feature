Feature: Women page scenarios
  Background:
    Given User opens url of homepage

    @US004b
    Scenario Outline: Verify my account links are displayed on Women page
      When User clicks on "Women" button
      Then Verify my account "<links>" are displayed
      Examples:
      |links|
      |My orders|
      |My credit slips|
      |My addresses   |
      |My personal info|

