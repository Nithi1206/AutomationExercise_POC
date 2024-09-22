@fea5
Feature: Existing Email
  Scenario: Register with existing email
    When User verifies the home page is visible successfully
    And User clicks on sigin or login button
    And User verifies new signup is visible
    And User enters username and already registered email
    And User clicks signup button
    But User verifies the error text "Email Address already exist!" is visible