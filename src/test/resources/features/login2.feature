Feature: Sign in Swag Labs

  As a registered user on the website
  I want to be able to sign in to my account
  So that I can access my account's features

  @Manual
  @Manual:Passed
  @Manual-last-tested:sprint-15
  Scenario: Monitoring a new low risk customer
    Given Joe is a new customer
    And Joe is considered a low risk customer
    When he is onboarded
    Then his account should be scheduled for review in 3 months time

  Scenario: Successful sign in
    Given I am on the sign-in page
    When I enter my valid credentials
    Then I should see the homepage of my account

  Scenario: Failed sign in
    Given I am on the sign-in page
    When I enter invalid credentials
    Then I should see an error message indicating that the credentials are incorrect

  Scenario: Locked user
    Given my account is locked
    When I attempt to sign in with my valid credentials
    Then I should see an error message indicating that my account is locked

  # Specifications:
  # - To enter my valid credentials, I must enter my correct email and password.
  # - To enter invalid credentials, I must enter an incorrect email or password.
  # - If my account is locked, I won't be able to sign in and will see an error message.
  # - If I sign in successfully, I should see the homepage of my account and a personalized welcome message.
  # - If I enter invalid credentials, I should see an error message indicating that the credentials are incorrect.