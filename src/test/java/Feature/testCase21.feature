@fea21
  Feature: Add Review
    Scenario: Add Review on Products
      When User clicks on product button on homepage
      Then User verifies that all product page url contains text "products"
      When User clicks on view product button
      Then User verifies Write your Review text is available "WRITE YOUR REVIEW"
      When User enters name "Nithi" email "nithi87@gmail.com" and review "Product is very good"
      And User clicks on submit button
      Then User verifies success message "Thank you for your review." is visible