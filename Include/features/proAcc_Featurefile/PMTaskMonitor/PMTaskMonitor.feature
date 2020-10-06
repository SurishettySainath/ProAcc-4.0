#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Janaki Uppalapati	  																							          Reviewed By: Kamal
# Date   :   08/04/2020                                                                     Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: PM Task Monitor
# Feature Description: PM Task Monitor
#---------------------------------------------------------------------------------------------------------------------------------
Feature: PM Task Monitor

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
    Given User is on PM Task Monitor page
    When User has to select Project<ProjectName> for PM Task Monitor
    And User has to click on Submit button for PM Task Monitor
    And User has to edit the task<PMTask>,<EstDuration>,<ActDuration> and status<Status> and comments<Comments> for PM Task Monitor
    Then User successfully submitted the project name for PM Task Monitor module

    Examples: 
      | PMTask | ProjectName         | EstDuration | ActDuration | Status           | Comments         |
      | QA     | jc Pilot Phase Test | 12:00       | 13:00       | Work In Progress | Work In Progress |
