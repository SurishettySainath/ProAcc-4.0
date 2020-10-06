#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Sainath						  																							Reviewed By: Kamal
# Date   :   15/08/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Customer deletion
# Feature Description: To add delete Customers in Admin Module
#---------------------------------------------------------------------------------------------------------------------------------
Feature: User deletion

  @SmokeTest
  Scenario Outline: User deletion
    Given User should navigate to Customerlist page
    When User has to enter customername<customername> in search box
    And User has to click on delete button for customer
    Then User has successfully deleted customer

    Examples: 
      | customername |
      | jc Test    |
