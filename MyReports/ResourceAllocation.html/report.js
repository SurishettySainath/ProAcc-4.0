$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/ResourceAllocation.feature");
formatter.feature({
  "name": "Resource Allocation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to ProAcc page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on LOG IN button",
  "keyword": "When "
});
formatter.step({
  "name": "User will be logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "jc_PM",
        "b12345@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to ProAcc page",
  "keyword": "Given "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_should_navigate_to_ProAcc_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters jc_PM and b12345@",
  "keyword": "And "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_enters(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on LOG IN button",
  "keyword": "When "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_clicks_on_LOG_IN_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_will_be_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Resource Allocation functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Resource Allocation page\u003cPhases\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select Project Name\u003cProjectnameforResourceAllocation\u003e and Instance Name\u003cInstancenameforResourceAllocation\u003e from the dropdown for Resource Allocation",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on select instance button for Resource Allocation",
  "keyword": "And "
});
formatter.step({
  "name": "User should allocate owner\u003cOwneroftask\u003efor a particular task",
  "keyword": "And "
});
formatter.step({
  "name": "User should select instance successfully for Resource Allocation",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProjectnameforResourceAllocation",
        "InstancenameforResourceAllocation",
        "Owneroftask",
        "Phases"
      ]
    },
    {
      "cells": [
        "jc Pilot Phase Test",
        "J12",
        "jc_Consultant",
        "Assessment"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Resource Allocation functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Resource Allocation pageAssessment",
  "keyword": "Given "
});
formatter.match({
  "location": "ResourceAllocation_StepDef.user_is_on_Resource_Allocation_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Project Namejc Pilot Phase Test and Instance NameJ12 from the dropdown for Resource Allocation",
  "keyword": "When "
});
formatter.match({
  "location": "ResourceAllocation_StepDef.user_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown_for_Resource_Allocation(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on select instance button for Resource Allocation",
  "keyword": "And "
});
formatter.match({
  "location": "ResourceAllocation_StepDef.user_has_to_click_on_select_instance_button_for_Resource_Allocation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should allocate ownerjc_Consultantfor a particular task",
  "keyword": "And "
});
formatter.match({
  "location": "ResourceAllocation_StepDef.user_should_allocate_owner_for_a_particular_task(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select instance successfully for Resource Allocation",
  "keyword": "Then "
});
formatter.match({
  "location": "ResourceAllocation_StepDef.user_should_select_instance_successfully_for_Resource_Allocation()"
});
formatter.result({
  "status": "passed"
});
});