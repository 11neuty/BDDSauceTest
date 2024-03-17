@Purchase
  Feature: Flow purchase item on saucedemo
    As a valid user i can purchase  any item on saucedemo.com

  Scenario: User makes a purchase with 2 item
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    When User sort item by "Price (high to low)"
    When User add to cart button for "Sauce Labs Bike Light"
    And  User add to cart button for "Sauce Labs Onesie"
    Then User click on shopping cart badge
    And  User remove item "Sauce Labs Onesie" from shopping chart
    And  User click checkout button
    When User fill first name as "Ryan", last name as "Pratama", and postal code as "51152"
    And  User Click Continue
    Then User redirect to Checkout Overview and see total payment
    When  User Click Finish
    Then User redirect to Checkout complete page
