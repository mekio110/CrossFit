@loginPage @ui @uiSmoke @uiRegression @smoke @regression
Feature: Login page

  Background: User is on the Main page
    Given user is on the Main page
    When user clicks on "LOG IN" button

  Scenario: User sees Login screen
    Then user should see Login screen

  Scenario: Login screen elements should be displayed
    Then User should see Login screen elements
      |Log In                         |
      |Please log in with your existing CrossFit ID (from the Open, Judges Course, or a seminar registration). If you are new, create an account.|
      |Email                          |
      |Password                       |
      |Log In                         |
      |CREATE AN ACCOUNT              |
      |FORGOT PASSWORD                |