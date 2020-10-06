#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: PreConversion functionality
# Feature Description: To add the details for PreConversion
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Conversion functionality for ProAcc


 @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username                      | password                          |
      | GlobalVariable.userconsultant | GlobalVariable.passwordconsultant |

 @SmokeTest
  Scenario Outline: Assessment Monitor functionality for PM
    Given User is on Monitor page<Phases>
    When User has to select Project Name<ProjectnameforAssessmentPM> and Instance Name<InstancenameforAssessmentPM> from the dropdown for project Assessment Monitor
    And User has to click on select instance button for PMAssessment Monitor
    And User has to edit task<EstDurationPM>,<ActDurationPM>,<NotePM> for project manager
    Then User should select instance successfully for Assessment Monitor PM

    Examples: 
      | ProjectnameforAssessmentPM | InstancenameforAssessmentPM | EstDurationPM | ActDurationPM | NotePM           |Phases|
      | Alexa Pilot Phase Test     | k01                         |             3 |             5 | Work In Progress |Conversion|
