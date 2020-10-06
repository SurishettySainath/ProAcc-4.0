#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: To view all the details
# Feature Description: View deatils on dashboard
#---------------------------------------------------------------------------------------------------------------------------------
Feature: To view all the details

  @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username | password |
      | jc_PM    | b12345@  |

  @SmokeTest
  Scenario Outline: 
    Given User is on dashboard page
    When User has to select projectName<PrjName> and Instance<Instance> from dropdown of dashboard module
    Then User has to verify texts and able to see the recent updates

    Examples: 
      | PrjName             | Instance |
      | jc Pilot Phase Test | J12      |
