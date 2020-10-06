#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Kamal
# Date   :   16/09/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Pm file upload in Pm login
# Feature Description: To upload file in Pm file upload
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Pm file upload in Pm login

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
  Scenario Outline: Pm file upload
    Given User should navigate to Pm file upload page
    When User has to select Project Name<Project_Name> and Instance Name<Instance_Name> from the dropdown
    And User has to upload PM FILES for Comprehensive Assessment and Readiness Check Report, Landscape System Management, Custom Code Analysis, License Optimization
    Then User should upload file successfully and navigate to assessment report

    Examples: 
      | Project_Name        | Instance_Name |
      | jc Pilot Phase Test | J12          |
