#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Assessment Monitor
# Feature Description: To add the details for Assessment Monitor
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Assessment Monitor

  @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username          | password          |
      | GlobalVariable.uc | GlobalVariable.pc |

  @SmokeTest
  Scenario Outline: Assessment Monitor functionality
    Given User is on Assessment Monitor page
    When User has to select Project Name<ProjectnameforAssessment> and Instance Name<InstancenameforAssessment> from the dropdown for Assessment Monitor
    And User has to click on select instance button for Assessment Monitor
    And User has to edit a particular task<EstDuration>,<ActDuration>,<Note>
    Then User should select instance successfully for Assessment Monitor

    Examples: 
      | ProjectnameforAssessment | InstancenameforAssessment | EstDuration | ActDuration | Note             |
      | Tin Pilot Phase Test   | T01                       |           3 |           5 | Work In Progress |
