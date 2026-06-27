Feature: Feature for testing

  Scenario Outline: scenario for testing
    Given user is on the home page
    When user enters values '<name>' and '<email>' and '<phone>' in different input boxes
    Then user is able to enter values in them successfully
  Examples:
|name|email|phone|
|rohit|rohitpac@gmail.com|90390503535|