#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K Janardhanan						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                                   Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Project Creation
# Feature Description: Creajcg new Project
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Project Creation

  @SmokeTest
  Scenario Outline: Creajcg new Project
    Given User is on Project Creation page
    When User has to enter project name<projectname>
    And User has to enter project description<description>
    And User has to select Customer name from dropdown<customername>
    And User has to select Project manager from dropdown<projectmanager>
    And User has to select Scenario from dropdown<Scenario>
    And User has to click create button for project creation
    Then User can search for created project in list<projectname>

    Examples: 
      | projectname            | description        | customername | projectmanager | Scenario |
      | jc Pilot Phase Test | Pro acc Inprogress | jc Test   | jc_PM       | MERGE    |
