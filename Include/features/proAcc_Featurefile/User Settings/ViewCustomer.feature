#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: View Customer functionality
# Feature Description: Customer verifying in View Customer page
#---------------------------------------------------------------------------------------------------------------------------------
Feature: View Customer functionality

  @SmokeTest
  Scenario Outline: View Customer
    Given User should be navigate view customer page
    When User can search for the customer in customer search box<Customer_search>
    Then User can see the created customer in the list<Customer_search>

    Examples: 
      | Customer_search |
      | jc Test        |
