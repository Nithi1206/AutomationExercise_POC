@fea9
  Feature: Search Product
    Scenario: Searching the product in the website
      When User verifies the home page is visible successfully
      And User clicks on product button on homepage
      Then User verifies navigated to all products page successfully "products"
      Then User enters product name "Winter Top" and click on search button
      Then User verifies search product text "SEARCHED PRODUCTS" is visible
      Then User verifies all the products related to search are visible