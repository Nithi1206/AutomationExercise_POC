@fea3
Feature: InCorrect Credentials
  Scenario: Login with incorrect email and password
    When User verifies the home page is visible successfully
    And User clicks on sigin or login button
    And User verifies Login to your account is visible
    And User enters incorrect email and password
    And User clicks on login button
    But User verifies your email or password is incorrect is visible