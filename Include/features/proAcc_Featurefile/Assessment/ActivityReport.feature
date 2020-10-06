#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K Janardhanan					  																			  Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: ActivityReport
# Feature Description: To view the ActivityReport in detail
#---------------------------------------------------------------------------------------------------------------------------------
Feature: ActivityReport

  @SmokeTest
  Scenario: ActivityReport functionality
    Given User is on ActivityReport page
    When User should select by phase and by condition values from dropdownlist
    Then User should see the ActivityReport
