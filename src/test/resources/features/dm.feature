@merve
Feature: Twitter DM functionality

  Scenario: As a Omer Fatih, i should send a DM to Merve

    Given user is already in dashboard of Twitter
    When  user types "@merveebaylarr" to the searchbox and clicks the result
    And user clicks message box
    And user clicks message input box
    Then user writes "nerdesin artik (otomatik mesaj)" and send the message

