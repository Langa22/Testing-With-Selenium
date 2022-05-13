@testOne
Feature: Facebook new user registration
  Scenario: Create a new Account
    When User opens facebook registration page
    Then User enters First Name
    Then User enters Last Name
    Then User enters Mobile number or email
    Then User enters Password
    Then User Selects date of birth
    Then User Selects Gender
    Then User clicks sign in button
    #Then User enters code
    #And  Facebook account has been created

  Scenario: Managing multiple browsers
    When User opens Amazon URL
    Then Searches for headphones
    Then Save the URL of headphones
    Then open new tab
    And Switch to the new tab and launch the stored URL