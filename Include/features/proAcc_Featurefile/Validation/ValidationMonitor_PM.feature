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
  Scenario Outline: Assessment Monitor functionality for PM
    Given User is on Monitor page<Phases>
    When User has to select Project Name<ProjectnameforAssessmentPM> and Instance Name<InstancenameforAssessmentPM> from the dropdown for project Assessment Monitor
    And User has to click on select instance button for PMAssessment Monitor
    And User has to edit task<EstDurationPM>,<ActDurationPM>,<NotePM> for project manager
    Then User should select instance successfully for Assessment Monitor PM

    Examples: 
      | ProjectnameforAssessmentPM | InstancenameforAssessmentPM | EstDurationPM | ActDurationPM | NotePM           | Phases     |
      | Alexa Pilot Phase Test     | P01                         |             3 |             5 | Work In Progress | Validation |
