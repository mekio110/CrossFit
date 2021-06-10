@mainPage @ui @uiSmoke @uiRegression @smoke @regression
Feature: Main page

  Background: User is on the Main page
    Given user is on the Main page

  Scenario: Brand Menu elements and Log In button should be displayed
    Then user should see Brand Menu elements
      |AFFILIATE  |
      |TRAINING   |
      |CME        |
      |GAMES      |
    And user should see "LOG IN" button

  Scenario: Main Menu elements, Calendar and Search button should be displayed
    Then user should see Main Menu elements
      |WHAT IS CROSSFIT   |
      |WORKOUTS           |
      |MOVEMENTS          |
      |INCLUSION          |
      |MEDIA              |
    And user should see date picker icon
    And user should see search icon