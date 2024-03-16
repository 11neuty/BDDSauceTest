@Login
  Feature: Login
    As a user i can login with valid credential

    Scenario: Login with valid credential
      Given User open the web sauce demo
      When User input "standard_user" as userName and "secret_sauce" as password and click login
      Then User already on dashboard page

