@fea8
  Feature: Verify products
    Scenario: Verify all products and product detail page
      When User verifies the home page is visible successfully
      And User clicks on product button on homepage
      Then User verifies navigated to all products page successfully "products"
      When User verifies product list is visible
      And User clicks on view product of first product
      Then User verifies landed to product detail page "product_details"
      When User verifies that details name category price availability condition brand are visible
