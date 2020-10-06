#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K Janardhanan						  																			Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: SimplificationReport
# Feature Description: To view the SimplificationReport in detail
#---------------------------------------------------------------------------------------------------------------------------------
Feature: SimplificationReport

  @SmokeTest
  Scenario: SimplificationReport functionality
    Given User is on SimplificationReport page
    When User should select value from dropdownlist
    Then User should see the Simplification report
