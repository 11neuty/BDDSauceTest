@Purchase
  Feature: Purchase
    As a valid user i can add to cart 2 item, remove 1 item, and checkout 1 item

  Scenario: User checkout item
    Given User open the web sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password and click login
    Then User already on dashboard page
    When User sort item by "Price (high to low)"
    And  User click add to cart button for "Sauce Labs Bike Light"
    And  User click add to cart button for "Sauce Labs Onesie"
    And  User click on shopping cart badge
    Then User redirect to your cart page
    When User remove item "Sauce Labs Onesie" from shopping chart
    And  User click checkout button
    Then User redirect to your information page
    When User fill first name as "Ryan", last name as "Pratama", and postal code as "51152"
    And  User click continue
    Then User see "Payment Information" as page overview
    When User click Finish
    Then User redirect to checkout complete page
