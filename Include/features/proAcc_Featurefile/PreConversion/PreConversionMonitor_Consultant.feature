#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Pre-Conversion Monitor for Consultant
# Feature Description: To add the details for Assessment Monitor for Consultant
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Pre-Conversion Monitor for Consultant

  @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username       | password |
      | jc_Consultant | b12345@  |

  @SmokeTest
  Scenario Outline: Assessment Monitor functionality for Consultant
    Given User is on Consultant Monitor page<Phases>
    When User has to select Consultant Customername<CustomernameforAssessmentConsultant> and Project Name<ProjectnameforAssessmentConsultant> and Consultant Instance Name<InstancenameforAssessmentConsultant> from the dropdown for consultant Assessment Monitor
    And User has to click on select instance button for Consultant Assessment Monitor
    And User has to edit task for consultant
    Then User should select instance successfully for Assessment Monitor Consultant

    Examples: 
      | CustomernameforAssessmentConsultant | ProjectnameforAssessmentConsultant | InstancenameforAssessmentConsultant | Phases         |
      | jc Test                            | jc Pilot Phase Test               | J12                                 | Pre-Conversion |
