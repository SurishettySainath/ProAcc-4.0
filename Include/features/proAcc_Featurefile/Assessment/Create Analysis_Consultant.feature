#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Kamal
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Crate analysis
# Feature Description: To add the details for creat analysis
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Create Analysis

  @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username        | password |
      | jc_Consultant | b12345@  |

  @SmokeTest
  Scenario Outline: Create Analysis functionality
    Given User is on create analysis page
    When User has to select Customer Name<Customer_Name>, Project Name<Project_Name> and Instance Name<Instance_Name> from the dropdown
    And User has to upload SAP READINESS CHECK FILES for Activities<Activities>, BWExtractors<BWExtractors>, CustomCode<CustomCode>, HANADatabase<HANADatabase>, FioriApps<FioriApps>, RelevantSimplification<RelevantSimplification>, SAPReadiness<SAPReadiness>
    And User has to click on the term of use and acknowldge checkboxes
    And User has to click on start analysis button
    Then User should successfully navigate to readinesscheck

    Examples: 
      | Customer_Name | Project_Name          | Instance_Name | Activities      | BWExtractors      | CustomCode      | HANADatabase            | FioriApps                 | RelevantSimplification           | SAPReadiness             |
      | jc Test     | jc Pilot Phase Test | J12           | Activities.xlsx | Bwextractors.xlsx | CustomCode.xlsx | HanaDatabaseTables.xlsx | RecommendedFioriApps.xlsx | RelevantSimplificationItems.xlsx | SAP Readiness Check.docx |
