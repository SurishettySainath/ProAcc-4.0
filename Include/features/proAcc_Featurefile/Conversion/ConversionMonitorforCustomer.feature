#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Janaki Uppalapati						  																							Reviewed By: Monica
# Date    :   30/06/2020                                                                 Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Assessment Monitor
# Feature Description: To add the details for Assessment Monitor
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Conversion Monitor for Customer

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
  Scenario Outline: Conversion Monitor for Customer functionality
    Given User is on Conversion Monitor for Customer page
    When User has to select Project Name <ProjectnameforConversion> and Instance Name <InstancenameforConversion> from the dropdown for Customer Conversion Monitor
    And User has to click on select instance button for Customer Conversion Monitor
    And User has to edit task EstDurationConsultant<EstDurationConsultant> and ActDurationConsultant<ActDurationConsultant> and NoteConsultant<NoteConsultant> for Customer Conversion Monitor
    Then User should select instance successfully for Conversion Monitor for Customer

    Examples: 
      | ProjectnameforConversion | InstancenameforConversion | EstDurationConsultant | ActDurationConsultant | NoteConsultant   |
      | Usgbc                    | U01                       |                     3 |                     5 | Work In Progress |
