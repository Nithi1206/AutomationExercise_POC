@fea17
  Feature: Remove Product
    Scenario: Remove Product From Cart
      When User verifies the home page is visible successfully
      And User add products to cart
      And User clicks on cart button
      Then User verifies cart page url contains text "view_cart"
      When Clicks X button corresponding to particular product
      Then User verifies that product is removed from the cart