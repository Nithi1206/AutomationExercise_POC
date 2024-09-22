@fea19
  Feature: Cart Brand Products
    Scenario: View and Cart Brand Products
      When User clicks on product button on homepage
      Then User verifies that Brands are visible on left side bar
      When User clicks on any brand name
      Then User verifies that brand page url is contained "brand_products" and brand products are displayed
      When User clicks on any other brand link on left side bar
      Then User verifies that brand page url is contained "brand_products" and can see products