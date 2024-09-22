@fea22
  Feature: Recommended Item
    Scenario: Add to cart from Recommended items
      When User scrolls to bottom of page
      Then User verifies Recommended Items are visible
      When User clicks on add to cart on Blue Top product on Recommended product
      When User clicks on view cart button
      Then User verifies that product Blue Top is displayed in cart page