@fea2
  Feature: Correct Credentials
    Scenario: Login with correct email and password
      When User verifies the home page is visible successfully
      And User clicks on sigin or login button
      And User verifies Login to your account is visible
      And User enters correct email and password
      And User clicks on login button
      And User verifies that logged in as username is visible
      And User clicks on delete account button
      And User verifies that account deleted is visible
