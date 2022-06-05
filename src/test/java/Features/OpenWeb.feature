
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
    Then select headphones
    Then Add to cart
    And  Go back to the home window and search laptops
    Then Select the laptop
    Then Add the laptop to cart
    And  Go back to the home page

  Scenario: Navigate to Take a lot website
    When user searches opens Google chrome
    Then User clicks on search and type in take a lot
    Then Clicks on search button
    Then Scroll down to Daily Deals
    #Then click on My Account
    #Then click on orders
    #Then Click on Login