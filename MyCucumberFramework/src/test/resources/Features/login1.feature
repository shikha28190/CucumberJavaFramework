Feature: Login functionality validation

  Scenario Outline: Login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user should be navigated to home page
    
    
    Examples:
    |username|password|
    |user1|pass1|
