#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Kamal
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: PMTaskCreation
# Feature Description: Creating new task for Project Manager
#---------------------------------------------------------------------------------------------------------------------------------
Feature: PMTaskCreation

  @SmokeTest
  Scenario Outline: Creating new task for Project Manager
    Given User is on PM Task Creation page
    When User has to select task category<TaskCategory>
    And User has to write task name<TaskName>,Est Hrs<EstHrs>
    And User has to click on create button for task creation
    Then User can search for created task in list<TaskName>

    Examples: 
      | TaskCategory | TaskName  | EstHrs |
      | Plan Project | jctesting | 10:10  |
