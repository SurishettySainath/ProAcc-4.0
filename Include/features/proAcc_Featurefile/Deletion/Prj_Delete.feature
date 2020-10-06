#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Project deletion
# Feature Description: To add delete Projects in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Project deletion
 


  @SmokeTest
  Scenario Outline: Project deletion
    Given User should navigate to Project Creation page
    When User has to enter Projectname<Projectname> in search box
    And User has to click on delete button for project
    Then User has successfully deleted Project

    Examples: 
      | Projectname |
      | jc Pilot Phase Test       |
