Feature: Swag Labs test

  @Manual
  @Manual:Passed
  @Manual-last-tested:sprint-15
  Scenario: Monitoring a new low risk customer
    Given Joe is a new customer
    And Joe is considered a low risk customer
    When he is onboarded
    Then his account should be scheduled for review in 3 months time

  Scenario: Login should be success

    Given User navigate to the Swag Labs page
    And User enter the username as "standard_user"
    And User enter the password as "secret_sauce"
    When User clicks on the login button
    Then Login should be success

  Scenario Outline: Login should not be success

    Given User navigate to the Swag Labs page
    And User enter the username as "<username>"
    And User enter the password as "<password>"
    When User clicks on the login button
    Then Login should fail

    Examples:
      | username | password    |
      | Torre    | 123456      |
      | Angel    | angel torre |