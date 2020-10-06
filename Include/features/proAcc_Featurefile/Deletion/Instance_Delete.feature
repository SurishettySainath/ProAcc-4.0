#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Instance deletion
# Feature Description: To add delete Instances in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Instance deletion

  @SmokeTest
  Scenario Outline: Instance deletion
    Given User should navigate to Instance Creation page
    When User has to enter Instancename<Instancename> in search box
    And User has to click on delete button for Insatnce
    Then User has successfully deleted Instance

    Examples: 
      | Instancename |
      | J12       |
