@LoginFunctionality
Feature: DSAlgo Portal Login Verification

  @TC_001
  Scenario Outline: Sign In successful with valid credentials
    Given user navigates to Home page
    And user clicks on Sign in link
    When user enters <username> in username field on Login page
    And user enters <password> in password field on Login page
    And user clicks on Login button
    Then validate the <message> on home page
    And validate the <username> and sign out button display on Home page

    Examples: 
      | username   | password  | message           |
      | techtitans | Time2fly$ | You are logged in |

  @TC_002
  Scenario Outline: Sign in with Username field empty
    Given user navigates to Home page
    And user clicks on Sign in link
    When user enters <username> in username field on Login page
    And user enters <password> in password field on Login page
    And user clicks on Login button
    Then validate the <error message> on Login page

    Examples: 
      | username | password  | error message               |
      |          | Time2fly$ | Please fill out this field. |

  @TC_003
  Scenario Outline: Sign in with Password field empty
    Given user navigates to Home page
    And user clicks on Sign in link
    When user enters <username> in username field on Login page
    And user enters <password> in password field on Login page
    And user clicks on Login button
    Then validate the <error message> on Login page

    Examples: 
      | username   | password | error message               |
      | techtitans |          | Please fill out this field. |

  @TC_004
  Scenario Outline: Sign in with invalid username and valid password
    Given user navigates to Home page
    And user clicks on Sign in link
    When user enters <username> in username field on Login page
    And user enters <password> in password field on Login page
    And user clicks on Login button
    Then validate the <error message> on Login page for invalid credential

    Examples: 
      | username     | password  | error message                 |
      | techtitans12 | Time2fly$ | Invalid Username and Password |

  @TC_005
  Scenario Outline: Sign in with invalid password and valid username
    Given user navigates to Home page
    And user clicks on Sign in link
    When user enters <username> in username field on Login page
    And user enters <password> in password field on Login page
    And user clicks on Login button
    Then validate the <error message> on Login page for invalid credential

    Examples: 
      | username   | password   | error message                 |
      | techtitans | Time2fly$1 | Invalid Username and Password |

  @TC_006 @Failed
  Scenario: Verify Register link on Login page
    Given user navigates to Home page
    And user clicks on Sign in link
    Then user clicks on Register link on Login page
