@DSAlgoHomePage
Feature: DSAlgo Portal Home Page Verification

  @TC01
  Scenario: Home page navigation
    Given user launches the DSAlgo portal URL
    And user clicks on Get Started button
    Then user landed on the Home page

  @TC02
  Scenario: Home page -Data Structures Dropdown
    Given user launches the DSAlgo portal URL
    And user clicks on Get Started button
    Then user landed on the Home page
    And user clicks Data Structures dropdown and able to see all options

  @TC03
  Scenario: Home page -Register link
    Given user launches the DSAlgo portal URL
    And user clicks on Get Started button
    Then user landed on the Home page
    And user clicks Register link and navigates to Register page

  @TC04
  Scenario: Home page -Sign In link
    Given user launches the DSAlgo portal URL
    And user clicks on Get Started button
    Then user landed on the Home page
    And user clicks Sign-in link and navigates to Login page

  @TC05 @Failed
  Scenario Outline: Home page -Get Started button below Data Structure topic
    Given user launches the DSAlgo portal URL
    And user clicks on Get Started button
    Then user landed on the Home page
    And user clicks on Get Started button below any Data Structure topic
    And user not logged in <warning message> should be displayed

    Examples: 
      | warning message       |
      | You are not logged in |
