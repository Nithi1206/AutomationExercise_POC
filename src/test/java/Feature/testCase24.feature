@fea24
  Feature: Download Invoice
    Scenario: Download Invoice after purchase order
      When User verifies the home page is visible successfully
      When User add products to cart
      When User clicks on cart button
      Then User verifies url contains text view_cart "view_cart"
      When User clicks on proceed to checkout
      When User clicks on register or login button
      And User fills all detail in signup and create account
      Then User verifies account created is visible and click on continue button
      When User verifies that logged in as username is visible
      And User clicks on cart button
      And User clicks on proceed to checkout
      And User verifies the texts "Address Details" and "Review Your Order" are visible
      And User add description "Deliver order after evening" and click place order button
      And User enters details name on card "Nithi" card number "23894739" cvc "766" expire month "07" year "2025"
      And User clicks on pay and confirm order button
      Then User verifies the success alert text "Congratulations! Your order has been confirmed!" is visible
      When User clicks on download invoice button and verifies invoice is downloaded successfully
      And User clicks on continue button
      And User clicks on delete account button
      Then User verifies that account deleted is visible and click on continue button