Feature: Find the derby matches date
  @wip
  Scenario: Go to the match date
    Given User write search button "Galatasaray"
    When User click on the team
    And User click on date which "08/01/2023"
    Then user should see "who will win" on the screen