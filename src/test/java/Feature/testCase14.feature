@fea14
  Feature: Register While Checkout
    Scenario: Place Order and Register While Checkout
      When User verifies the home page is visible successfully
      And User add products to cart
      And User clicks on cart button
      Then User verifies cart page url contains text "view_cart"
      When User clicks on proceed to checkout
      And User clicks on register or login button
      And User fills the detail in signup and create account
      Then User verifies account created is visible and click on continue button
      And User verifies that logged in as username is visible
      And User clicks on cart button in product page
      And User clicks on proceed to checkout button
      And User verifies the texts "Address Details" and "Review Your Order" are visible
      And User add description "Please deliver the order after evening" and click place order button
      And User enters details name on card "Nithi" card number "278377823" cvc "123" expire month "06" year "2025"
      And User clicks on pay and confirm order button
      And User verifies the success alert text "Congratulations! Your order has been confirmed!" is visible
      And User clicks on delete account button
      Then User verifies that account deleted text "ACCOUNT DELETED!" is visible and click on continue button