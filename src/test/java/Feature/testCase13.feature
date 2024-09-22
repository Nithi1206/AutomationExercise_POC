@fea13
  Feature: Product Quantity
    Scenario: Verify Product Quantity in Cart
      When User verifies the home page is visible successfully
      And User clicks on view product for any product on home page
      Then User verifies url contains product details text "product_details"
      When User increases quantity to four
      And User clicks on add to cart button
      Then User verifies that product is displayed in cart page with exact "4" quantity
