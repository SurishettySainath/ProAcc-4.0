#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Janaki Uppalapati					                  Reviewed By: Kamal
# Date   :   09/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Creating Issue Track
# Feature Description: To create the Issue Track
#---------------------------------------------------------------------------------------------------------------------------------
Feature: View Issue List

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
  Scenario Outline: View Issue
    Given User should be navigate Issue List page
    When User should select Project name<ProjectNameforIssuelist> and Instance name<InstanceNameforIssuelist> from the dropdown for issue list
    And User should click on select instance button for issue list

    Examples: 
      | ProjectNameforIssuelist | InstanceNameforIssuelist |
      | jc Pilot Phase Test     | J12                      |
