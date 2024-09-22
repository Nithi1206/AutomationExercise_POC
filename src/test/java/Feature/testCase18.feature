@fea18
  Feature: Category
    Scenario: View Category Products
      When User verifies that categories are visible on left side bar
      And User clicks on women category
      And User clicks on any category link under Women category
      And User verifies that category page is displayed and confirm text "Women - Tops Products"
      And On left side bar user click on any sub-category link of men category
      Then User verifies that category page url contains text "category_products"
