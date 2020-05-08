@Web @Modifiers
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "theodoricjonathan@gmail.com" on backoffice login page
    And User input password "123abc" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click Create Modifier
    And User input "Topping"
    And User click Manage
    And User click Add Option
    And User inputs "Boba"
    And User input price "5000"
    And User click save manage
    And User click Saves
    Then modifier "Topping" created
