@universities @api @apiSmoke @apiRegression @smoke @regression
Feature: Universities

  Background: Accept Json
    Given header should have json

  Scenario: All universities
    When user send get request to "search"
    Then Response status code should be 200
    And header should have content type json

  Scenario: Number of universities
    When user send get request to "search"
    Then number of universities should be 9746