Feature: To verify the facebook login page

  Scenario Outline: To verify login with invalid credentials
    Given user is on facebook login page
    When user enter "<username>" and "<password>"
    Then To check the functionality

    Examples: 
      | username |  | password |
      | mages    |  | isac     |
      | vera     |  |     1234 |
      | senthil  |  | vel      |
