@fea6
  Feature: ContactUs
    Scenario: Contact Us Form
      When User verifies the home page is visible successfully
      And User clicks on contact us button
      And User verifies text get in touch "GET IN TOUCH" is visible
      And User enters name email subject and message
      And User uploads file
      And User clicks on submit button
      And User clicks on ok
      And User verifies success message is visible "Success! Your details have been submitted successfully."
      And User clicks on home button and verifies landed on home page