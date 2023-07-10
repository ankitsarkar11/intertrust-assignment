# Created by Ankit.Sarkar at 10/07/2023
Feature: Timeline API Test Cases
  # Enter feature description here

  Scenario: Validate that the timeline API returns 200 status code with a given valid location
    Given Users hits the timeline API with location as "mumbai"
    Then Status code for the timeline API should be "200"

  Scenario: Validate that the timeline API returns 400 status code with a given invalid location
    Given Users hits the timeline API with location as "hsgdhsgdhsg"
    Then Status code for the timeline API should be "400"

  Scenario: Validate that the timeline API returns 400 status code with an empty location
    Given Users hits the timeline API with location as ""
    Then Status code for the timeline API should be "400"

  Scenario: Validate that the timeline API resolves to a valid address with a given location
    Given Users hits the timeline API with location as "Tallinn"
    Then Status code for the timeline API should be "200"
    And Timeline API should return data of the given location

  Scenario: Validate that the timeline API should cost only 1 credit
    Given Users hits the timeline API with location as "Tallinn"
    Then Status code for the timeline API should be "200"
    And Timeline API should cost "1" credit

  Scenario: Validate that the timeline API returns the response in the expected timezone
    Given Users hits the timeline API with location as "mumbai"
    Then Status code for the timeline API should be "200"
    And Timeline API should respond in the "Asia/Kolkata" timezone
