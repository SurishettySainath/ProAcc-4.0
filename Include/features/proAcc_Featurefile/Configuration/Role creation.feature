#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena k Janardhanan				  																				  Reviewed By: Monica
# Date    :   15/05/2020                                                          Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Role Creation
# Feature Description: Creating New Role
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Role Creation

  @SmokeTest
  Scenario Outline: Creating New Role
    Given User is on Role Creation page
    When User has to enter Role name<Rolename>
    And User has to click on create button for create Role
    Then User can search for created Role in list<Rolesearch>

    Examples: 
      | Rolename | Rolesearch |
      | UserRole | UserRole   |