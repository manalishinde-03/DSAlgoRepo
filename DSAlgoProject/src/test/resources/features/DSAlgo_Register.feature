@DSAlgoRegisterPage
Feature: DSAlgo Portal Register Page Verification

  @TC_1
  Scenario Outline: Registration successful with valid credentials
  	Given user navigates to Home page
    And user clicks on Register link
    When user enters <username> in username field on Register page
    And user enters <password> and <password confirmation> in password fields on Register page
    And user clicks on Register button
    Then validate the <message> on home page

    Examples: 
      | username       | password  | password confirmation | message                                   |
      | techtitanstest | Time2fly$ | Time2fly$             | New Account Created. You are logged in as |
