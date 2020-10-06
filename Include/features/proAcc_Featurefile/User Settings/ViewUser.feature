#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: View user functionality
# Feature Description: User verifying in View user's list page
#---------------------------------------------------------------------------------------------------------------------------------
Feature: View User list functionality

  @SmokeTest
  Scenario Outline: View User list
    Given User should be navigate to view user list page
    When User can search for the user in user search box<User_search>
    Then User can see the created User in the list<User_search>

    Examples: 
      | User_search     |
      | Alexa_Admin      |
      | AlexaPM          |
      | Alexa_Consultant |
      | Alexa_Customer   |
