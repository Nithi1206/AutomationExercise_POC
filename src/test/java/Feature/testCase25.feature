@fea25
  Feature: Verify Scroll Up
    Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
      When User verifies the home page is visible successfully
      And User scrolls to bottom of page
      And User verifies text subscription is available "SUBSCRIPTION"
      And User clicks on arrow at bottom right side to move upward
      And User verifies that page is scrolled up
      And User verifies Full-Fledged practice website for Automation Engineers text is visible on screen