#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Activity deletion
# Feature Description: To add delete Activitys in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Activity deletion

  @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username | password |
      | Admin    | Admin    |

  @SmokeTest
  Scenario Outline: Activity deletion
    Given User should navigate to Activity Creation page
    When User has to enter Activityname<Activityname> in search box
    And User has to click on delete button for Activity
    Then User has successfully deleted Activity

    Examples: 
      | Activityname                   |
      | jc Custom Code Assessment      |
      | jc Custom Code Pre_Conversion  |
      | jc Custom Code Conversion      |
      | jc Custom Code Post_Conversion |
