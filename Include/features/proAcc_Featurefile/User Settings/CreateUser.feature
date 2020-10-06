#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Create User functionality
# Feature Description: Create User with their fields
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Create User Functionality

  @SmokeTest
  Scenario Outline: Create User Admin
    Given User should be on create new user page
    When User has to fill the fields like Name<Name>,LoginID<LoginID>,Password<Password>,Confirmpassword<Confirmpassword>,Email<Email>,Phonenumber<Phonenumber>,Usertype<Usertype>,Role<Role>,Customer<Customer>
    And User has to click on Create button
    Then User should successfully created new user

    Examples: 
      | Name           | LoginID                           | Password                              | Confirmpassword                       | Email              | Phonenumber | Usertype        | Role       | Customer |
      | jc_Admin      | GlobalVariable.useradmin          | GlobalVariable.passwordadmin          | GlobalVariable.passwordadmin          | Test@Promantus.com |  8976543210 | Admin           |            |          |
      | jc_PM         | GlobalVariable.userprojectmanager | GlobalVariable.passwordprojectmanager | GlobalVariable.passwordprojectmanager | Test@Promantus.com |  8976543210 | Project Manager |            |          |
      | jc_Consultant | GlobalVariable.userconsultant     | GlobalVariable.passwordconsultant     | GlobalVariable.passwordconsultant     | Test@Promantus.com |  8976543210 | Consultant      | Functional |          |
      | jc_Customer   | GlobalVariable.uc                 | GlobalVariable.pc                     | GlobalVariable.pc                     | Test@Promantus.com |  8976543210 | Customer        | Functional | jc Test |
