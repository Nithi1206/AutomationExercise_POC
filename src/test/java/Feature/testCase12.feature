@fea12
  Feature: Add Product
    Scenario: Add product in cart
      When User verifies the home page is visible successfully
      And User clicks on product button on homepage
      And User hover over first product and click Add to cart
      And User click continue shopping button
      And User hover over second product and click Add to cart
      And User clicks on view cart button
      And User verifies both products are added to cart
      And User verifies their prices quantity and total price