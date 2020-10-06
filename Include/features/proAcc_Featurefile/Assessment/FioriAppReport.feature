#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K Janardhanan						  																			Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: FioriApp Report
# Feature Description: To view the FioriApp Report in detail
#---------------------------------------------------------------------------------------------------------------------------------
Feature: FioriApp Report

  @SmokeTest
  Scenario: FioriApp Report functionality
    Given User is on FioriApp Report page
    When User should select value from dropdownlist of FioriApps report
    Then User should see the FioriApp Report
