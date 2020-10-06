#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: User deletion
# Feature Description: To add delete Users in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: User deletion

  @SmokeTest
  Scenario Outline: User deletion
    Given User should navigate to Userlist page
    When User has to enter username<username> in search box
    And User has to click on delete button
    Then User has successfully deleted particular user

    Examples: 
      | username       |
      | jc_PM         |
      | jc_Admin      |
      | jc_Consultant |
      | jc_Customer   |
     