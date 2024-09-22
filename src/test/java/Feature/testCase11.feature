@fea11
  Feature: Verify Cart Subscription
    Scenario: Verify Subscription on cart page
      When User verifies the home page is visible successfully
      And User clicks on cart button
      And User scroll down to footer
      Then User verifies text subscription is available "SUBSCRIPTION"
      When User enters email address in input and click on arrow button
      Then User verifies the text "You have been successfully subscribed!" is visible
