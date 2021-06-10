@universities @api @apiSmoke @apiRegression @smoke @regression
Feature: Universities

  Background: Accept Json
    Given header should have json
    When user send get request to "search"

  Scenario: All universities
    Then Response status code should be 200
    And header should have content type json

  Scenario: Number of universities
    Then number of universities should be 9746

    #Deserialization
  Scenario: Convert Json to POJO
    Then convert Json to POJO

    #Serialization
  Scenario: Convert POJO to Json
    Then convert POJO to Json