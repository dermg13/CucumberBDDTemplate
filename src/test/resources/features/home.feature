Feature: homepage related scenarios

  @US001
  Scenario: Verify title of page
    Given User opens url of homepage
    Then Verify title of page is "My Store"


    @US002
    Scenario: Verify search field is enabled
      Given User opens url of homepage
      When User clicks on search field
      And User enters something in field
      Then Verify search button is enabled

   @US003
   Scenario: Verify Selenium Framework button works
     Given User opens url of homepage
     When User clicks on "Selenium Framework" button
     Then Verify title of page is "Selenium Framework | Selenium, Cucumber, Ruby, Java et al."

   #@US004 Verify link texts under My account footer are displayed

  @US004
  Scenario: Verify link texts under My account footer are displayed

