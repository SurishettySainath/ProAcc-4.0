#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Login to ProAcc Page
# Feature Description: Login to ProAcc website with the username and password
#---------------------------------------------------------------------------------------------------------------------------------
Feature: ProAcc login

  @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username | password |
      | Admin    | Admin    |
