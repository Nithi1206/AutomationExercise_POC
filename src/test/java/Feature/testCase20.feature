@fea20
  Feature: Search Products
    Scenario: Search Products and verify cart after login
      When User clicks on product button on homepage
      Then User verifies that all product page url contains text "products"
      When User enters product name "Blue Top" in search input and click search button
      Then User verifies Searched Product is visible on the page "Searched Products"
      When User verifies product related to search is visible "Blue Top"
      And User add the product to cart
      And User clicks on cart button and verify that products are visible in cart
      And User clicks on signin or login button and submit login details
      And User clicks on cart page
      Then User verifies that that those products are visible in cart after login as well