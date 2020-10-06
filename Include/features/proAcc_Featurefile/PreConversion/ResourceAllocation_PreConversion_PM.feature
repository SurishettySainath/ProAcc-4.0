#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Harsh Bhatt						  																							Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: Resource Allocation
# Feature Description: To add the details for Resource Allocation
#---------------------------------------------------------------------------------------------------------------------------------
Feature: Resource Allocation

  @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username | password |
      | jc_PM   | b12345@  |

  @SmokeTest
  Scenario Outline: Resource Allocation functionality
    Given User is on Resource Allocation page<Phases>
    When User has to select Project Name<ProjectnameforResourceAllocation> and Instance Name<InstancenameforResourceAllocation> from the dropdown for Resource Allocation
    And User has to click on select instance button for Resource Allocation
    And User should allocate owner<Owneroftask>for a particular task
    Then User should select instance successfully for Resource Allocation

    Examples: 
      | ProjectnameforResourceAllocation | InstancenameforResourceAllocation | Owneroftask    | Phases         |
      | jc Pilot Phase Test             | J12                               | jc_Consultant | Pre-Conversion |
