#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena k Janardhanan				  																				  Reviewed By: Monica
# Date    :   15/05/2020                                                          Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Create Instance
# Feature Description: Creajcg New Instance
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Create Instance

  @SmokeTest
  Scenario Outline: Creajcg New Instance
    Given User is on create instance page
    When User has to enter instance name<Instancename>
    And User has to select project from dropdown<projecjcstancename>
    And User has to click on create button for create instance
    Then User can search for created instance in list<Instancesearch>

    Examples: 
      | Instancename | projecjcstancename  | Instancesearch |
      | J12          | jc Pilot Phase Test | J12            |
