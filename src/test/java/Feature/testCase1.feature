@fea1
Feature: Automation Exercise


  Scenario: User Registeration
    When User verifies the home page is visible successfully
    And User clicks on sigin or login button
    And User verifies new signup is visible
    And User enters name and email address
    And User clicks signup button
    And User fills tite name email password and date of birth
    And User selects checkbox signup for newsletter
    And User selects checkbox receive special offers from our partners
    And User fills name address and contact number
    And User clicks on create account button
    And User verifies account created is visible
    And User clicks continue button
    Then User verifies that logged in as username is visible
    When User clicks on delete account button
    Then User verifies that account deleted is visible and click continue button