#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: PmTask deletion
# Feature Description: To add delete PmTasks in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: PmTask deletion

  @SmokeTest
  Scenario Outline: PmTask deletion
    Given User should navigate to PmTask Creation page
    When User has to enter PmTaskname<PmTaskname> in search box
    And User has to click on delete button for PmTask
    Then User has successfully deleted PmTask

    Examples: 
      | PmTaskname |
      | jctest      |
