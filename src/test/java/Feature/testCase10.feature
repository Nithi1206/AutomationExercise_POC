@fea10
  Feature: Verify subscription
    Scenario: Verifies subscription is available on home page
      When User verifies the home page is visible successfully
      When User scroll down to footer
      Then User verifies text subscription is available "SUBSCRIPTION"
      When User enters email address in input and click on arrow button
      Then User verifies the text "You have been successfully subscribed!" is visible