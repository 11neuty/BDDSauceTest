@AddToCart
Feature: AddToCart
    As a user i can sort item and add to cart
    Background:
        Given User open the web sauce demo
        When User input "standard_user" as userName and "secret_sauce" as password and click login
        Then User already on dashboard page

    Scenario: Sort item and add to cart item

        Given User already on dashboard page
        When  User sort item by "Price (high to low)"
        And   User add to cart button for "Sauce Labs Bike Light"
        And   User add to cart button for "Sauce Labs Onesie"
        And  User click on shopping cart badge
        Then   User already on CartPage