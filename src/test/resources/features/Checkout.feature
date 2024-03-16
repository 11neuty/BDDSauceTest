@Checkout
Feature: RemoveAndCheckout
  As a user i can remove and checkout item
  Background:
    Given User open the web sauce demo
    When  User input "standard_user" as userName and "secret_sauce" as password and click login
    Then  User already on dashboard page
    When  User sort item by "Price (high to low)"
    And   User add to cart button for "Sauce Labs Bike Light"
    And   User add to cart button for "Sauce Labs Onesie"
    And   User already on CartPage

  Scenario: User remove item and checkout item
    Given User already on CartPage
    When  User remove item from shopping chart
    And   User click checkout button
    Then  User fill first name as "Ryan", last name as "Pratama", and postal code as "51152"
    And   User Click Continue
