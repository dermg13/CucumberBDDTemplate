Feature: Dresses page tests

  Background: Open Dresses page
    Given User opens url of homepage
    When user click "Dresses" button

  @US004c
  Scenario Outline: Verify my accounts on Dresses page are displayed on Dresses page
    Then Verify "<links>" are displayed

    Examples:
    |links|
    |My orders|
    |My credit slips|
    |My addresses|
    |My personal info|
