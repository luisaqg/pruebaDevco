Feature: Use cart

  Background: logIn
    Given The user logs in

    Scenario: search for an item and add it to the cart
      When The user add item to the cart
      Then He sees the object added