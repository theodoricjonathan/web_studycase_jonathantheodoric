@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "theodoricjonathan@gmail.com" on backoffice login page
    And User input password "123abc" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click Create Category
    And User input "Makanan" on category page
    And User click save
    Then category "Makanan" created
