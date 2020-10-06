#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: PreConversion functionality
# Feature Description: To add the details for PreConversion
#---------------------------------------------------------------------------------------------------------------------------------
Feature: PreConversion functionality for ProAcc

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
  Scenario Outline: Pre Conversion functionality
    Given User is on Pre Conversion page for Customer
    When User has to select Pre Conversion for Project Name<ProjectnameforPreConversion> and Instance Name<InstancenameforPreConversion> from the dropdown for customer
    And User has to click on select instance button of Pre Conversion for customer
    And User has to edit task<EstDuration>,<ActDuration>,<Note> for Pre Conversion customer
    Then User should select instance successfully for Pre Conversion customer

    Examples: 
      | ProjectnameforPreConversion | InstancenameforPreConversion | EstDuration | ActDuration | Note             |
      | Jon Pilot Phase Test        | T01                          |           3 |           5 | Work In Progress |
