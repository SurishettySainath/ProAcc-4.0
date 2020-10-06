$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Configuration/ActivityCreation.feature");
formatter.feature({
  "name": "Activity Creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creating Activity",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create activity page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to fill the fields like Task\u003cTask\u003e,ApplicationArea\u003cApplicationArea\u003e,Phase\u003cPhase\u003e,Role\u003cRole\u003e,BuildingBlock\u003cBuildingBlock\u003e,Est Hrs\u003cEstHrs\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on create button for create activity and need to select task",
  "keyword": "And "
});
formatter.step({
  "name": "User can search for created activity in list\u003cActivitysearch\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Task",
        "ApplicationArea",
        "Phase",
        "Role",
        "Activitysearch",
        "BuildingBlock",
        "EstHrs"
      ]
    },
    {
      "cells": [
        "jc Custom Code Assessment",
        "Functional - All",
        "Assessment",
        "Functional",
        "jc Custom Code Assessment",
        "Application Overview",
        "10:43"
      ]
    },
    {
      "cells": [
        "jc Custom Code Pre_Conversion",
        "Functional - All",
        "Pre Conversion",
        "Functional",
        "jc Custom Code Pre_Conversion",
        "Data Consistency Verification",
        "11:34"
      ]
    },
    {
      "cells": [
        "jc Custom Code Conversion",
        "Technical - BASIS",
        "Conversion",
        "BASIS",
        "jc Custom Code Conversion",
        "Custom Code",
        "12:34"
      ]
    },
    {
      "cells": [
        "jc Custom Code Post_Conversion",
        "Functional - All",
        "Post Conversion",
        "Functional",
        "jc Custom Code Post_Conversion",
        "Application Overview",
        "34:32"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating Activity",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create activity page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_is_on_create_activity_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Taskjc Custom Code Assessment,ApplicationAreaFunctional - All,PhaseAssessment,RoleFunctional,BuildingBlockApplication Overview,Est Hrs10:43",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_fill_the_fields_like_Task_Sequence_ApplicationArea_Phase_and_Role(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on create button for create activity and need to select task",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_click_on_create_button_for_create_activity_and_need_to_select_task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for created activity in listjc Custom Code Assessment",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_can_search_for_created_activity_in_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating Activity",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create activity page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_is_on_create_activity_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Taskjc Custom Code Pre_Conversion,ApplicationAreaFunctional - All,PhasePre Conversion,RoleFunctional,BuildingBlockData Consistency Verification,Est Hrs11:34",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_fill_the_fields_like_Task_Sequence_ApplicationArea_Phase_and_Role(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on create button for create activity and need to select task",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_click_on_create_button_for_create_activity_and_need_to_select_task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for created activity in listjc Custom Code Pre_Conversion",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_can_search_for_created_activity_in_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating Activity",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create activity page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_is_on_create_activity_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Taskjc Custom Code Conversion,ApplicationAreaTechnical - BASIS,PhaseConversion,RoleBASIS,BuildingBlockCustom Code,Est Hrs12:34",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_fill_the_fields_like_Task_Sequence_ApplicationArea_Phase_and_Role(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on create button for create activity and need to select task",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_click_on_create_button_for_create_activity_and_need_to_select_task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for created activity in listjc Custom Code Conversion",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_can_search_for_created_activity_in_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating Activity",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create activity page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_is_on_create_activity_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Taskjc Custom Code Post_Conversion,ApplicationAreaFunctional - All,PhasePost Conversion,RoleFunctional,BuildingBlockApplication Overview,Est Hrs34:32",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_fill_the_fields_like_Task_Sequence_ApplicationArea_Phase_and_Role(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on create button for create activity and need to select task",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_has_to_click_on_create_button_for_create_activity_and_need_to_select_task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for created activity in listjc Custom Code Post_Conversion",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityCreation_StepDef.user_can_search_for_created_activity_in_list(String)"
});
formatter.result({
  "status": "passed"
});
});