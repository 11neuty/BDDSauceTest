@Purchase
  Feature: Purchase
    As a valid user i can add to cart 2 item, remove 1 item, and checkout 1 item

  Scenario: User checkout item
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    When User sort item by "Price (high to low)"
    When User click add to cart button for "Sauce Labs Bike Light"
    And  User click add to cart button for "Sauce Labs Onesie"
    And  User click on shopping cart badge
    When User click checkout button
    And  User remove item "Sauce Labs Onesie" from shopping chart
    When User fill first name as "Ryan", last name as "Pratama", and postal code as "51152"
    And  User Click Continue
    Then User redirect to Checkout Overview and see total payment
    When  User Click Finish
    Then User redirect to Checkout complete page
