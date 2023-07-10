# Created by Ankit.Sarkar at 10/07/2023
Feature: Visual Crossing Data Validation

  Scenario: Validate that the visual crossing data is shown for a valid location
    Given User opens the visual crossing website
    Then The home page should be open
    When User clicks on Accept all cookies button on the cookie popup
    Then The cookie popup should disappear
    When User clicks on "Weather Data" navigation link
    Then The Weather Data page should be open
    When User enters "mumbai" in the location search box and clicks on Search button
    Then The Weather History page should open "mumbai" as location

  Scenario: Validate that the visual crossing data is shown empty for an invalid location
    Given User opens the visual crossing website
    Then The home page should be open
    When User clicks on Accept all cookies button on the cookie popup
    Then The cookie popup should disappear
    When User clicks on "Weather Data" navigation link
    Then The Weather Data page should be open
    When User enters "dfdfhhshs" in the location search box and clicks on Search button
    Then The Weather History page should open with empty data

  Scenario: Validate that the visual crossing data shows all the relevant graphs
    Given User opens the visual crossing website
    Then The home page should be open
    When User clicks on Accept all cookies button on the cookie popup
    Then The cookie popup should disappear
    When User clicks on "Weather Data" navigation link
    Then The Weather Data page should be open
    When User enters "mumbai" in the location search box and clicks on Search button
    Then The Weather History page should show all the relevant graphs


  Scenario: Validate that all the links in the weather history page are working
    Given User opens the visual crossing website
    Then The home page should be open
    When User clicks on Accept all cookies button on the cookie popup
    Then The cookie popup should disappear
    When User clicks on "Weather Data" navigation link
    Then The Weather Data page should be open
    When User enters "mumbai" in the location search box and clicks on Search button
    Then The Weather History page should have all the links working



