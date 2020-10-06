#---------------------------------------------------------------------------------------------------------------------------------
# Authors : Seena K Janardhanan						  																			Reviewed By: Monica
# Date   :   15/05/2020                                                           Reviewed On:
# Last Updated By:
# Last Updated On:
# Feature Name: ReadinessReport
# Feature Description: To view the ReadinessReport in detail
#---------------------------------------------------------------------------------------------------------------------------------
Feature: ReadinessReport
 @SmokeTest
  Scenario Outline: Login to application
    Given User should navigate to ProAcc page
    And User enters <username> and <password>
    When User clicks on LOG IN button
    Then User will be logged in successfully

    Examples: 
      | username                      | password                          |
      | GlobalVariable.userconsultant | GlobalVariable.passwordconsultant |

  @SmokeTest
  Scenario Outline: ReadinessReport functionality
    Given User is on ReadinessReport page
    When User should select customer name<CustomernameforReadinessReport>, project name<ProjectnameforReadinessReport> and instance name<InstancenameforReadinessReport> from the dropdown list
    Then User should see the Rediness report

    Examples: 
      | CustomernameforReadinessReport | ProjectnameforReadinessReport | InstancenameforReadinessReport |
      | James Test                     | James Pilot Phase Test        | L01                            |
