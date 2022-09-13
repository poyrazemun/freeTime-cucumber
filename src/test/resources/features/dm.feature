@merve
Feature: Twitter DM functionality

  Scenario: As Omer Fatih, i should send a DM to Merve

    Given user is already on the dashboard of Twitter
    When  user types "@merveebaylarr" to the searchbox and clicks the result
    And user clicks message box
    And user clicks message input box
    Then user writes "a Romeo and Juliet quote" and send the message

