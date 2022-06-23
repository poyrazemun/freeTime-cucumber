Feature: Twitter DM functionality

  Scenario: As a Omer Fatih, i should send a DM to Merve

    Given user is already in dashboard of Twitter
    When  user types "@merveebaylarr" to the searchbox and clicks the result
    When user clicks message box
    When user clicks message input box
    When user writes "askim deneme cevap yazma" and send the message

