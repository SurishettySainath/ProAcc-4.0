#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Janaki Uppalapati					                  Reviewed By: Kamal
# Date   :   09/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Creating Issue Track
# Feature Description: To create the Issue Track
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Creating Issue

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
  Scenario Outline: Creating Issue
    Given User is in CREATE ISSUE page
    When User should select Project name<ProjectNameforIssueTrack> and Instance name<InstanceNameforIssueTrack> from the dropdown
    And User should click on select instance button
    And User should fill Issue Name<IssueName>,phase<Phase>,AssignedTo<AssignedTo>,Task<Task> and Comments<Comments> and click on Create button
    Then User should able to Create Issue successfully

    Examples: 
      | ProjectNameforIssueTrack | InstanceNameforIssueTrack | IssueName | Phase      | AssignedTo | Task        | Comments          |
      | jc Pilot Phase Test      | J12                       | Test      | Assessment | sai        | Accelerator | Issue in progress |
