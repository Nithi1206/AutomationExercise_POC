@fea23
  Feature: Verify Address Details
    Scenario: Verify Address Details on Checkout Page
      When User verifies the home page is visible successfully
      And User clicks on sigin or login button
      And User fills all detail in signup and create account
      Then User verifies account created is visible and click on continue button
      Then User verifies that logged in as username is visible
      When User add product to cart
      And User clicks on cart button
      Then User verifies url conatins text view_cart "view_cart"
      When User clicks on proceed to checkout
      When User verifies that the delivery address is same address filled at the time registration of account
      And User verifies that the billing address is same address filled at the time registration of account
      When User clicks on delete account button
      Then User verifies that account deleted text "ACCOUNT DELETED!" is visible and click on continue button

