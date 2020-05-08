@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "theodoricjonathan@gmail.com" on backoffice login page
    And User input password "123abc" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    And User click Create Item
    And User input name "Tea"
    And User input prices "20000"
    And User click save item
    Then item "Tea" created