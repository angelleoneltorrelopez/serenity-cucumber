Feature: otro test

  Scenario: Login should be success

    Given User navigate
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