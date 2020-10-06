#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K Janardhanan						  																			Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Custom code analysis
# Feature Description: To view the Custom code analysis in detail
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Custom code analysis

  @SmokeTest
  Scenario: Custom code analysis functionality
    Given User is on Custom code analysis page
    When User should see Custom code analysis table
    Then User can see the custom code analysis report generated successfully
