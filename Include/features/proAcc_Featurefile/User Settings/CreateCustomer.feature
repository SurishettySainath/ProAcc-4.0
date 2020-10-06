#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Create Customer and View Customer functionality
# Feature Description: Create Customer Filling datas and verifying in View Customer
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Create Customer and View Customer functionality

  @SmokeTest
  Scenario Outline: Create Customer
    Given User should be on new customer page
    When User has to fill the fields like customer name<Customername>, Industrysector<Industrysector>,ContactName<ContactPersonName>,emailid<emailid>,phone<phone>
    And User has to click on create button for creating customer
    Then User has successfully created new customer

    Examples: 
      | Customername | Industrysector | ContactPersonName | emailid        | phone      |
      | jc Test      | Construction   | jcTest            | Test@gmail.com | 8994447890 |
