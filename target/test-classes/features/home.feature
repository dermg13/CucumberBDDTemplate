Feature: homepage related scenarios

  @US001
  Scenario: Verify title of page
    Given User opens url of homepage
    Then Verify title of page


    @US002
    Scenario: Verify search field is enabled
      Given User opens url of homepage
      When User clicks on search field
      And User enters something in field
      Then Verify search button is enabled