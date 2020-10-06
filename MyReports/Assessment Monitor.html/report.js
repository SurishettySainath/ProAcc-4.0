$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/Assessment Monitor.feature");
formatter.feature({
  "name": "Assessment Monitor",
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
        "GlobalVariable.uc",
        "GlobalVariable.pc"
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
  "name": "User enters GlobalVariable.uc and GlobalVariable.pc",
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
  "name": "Assessment Monitor functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Assessment Monitor page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select Project Name\u003cProjectnameforAssessment\u003e and Instance Name\u003cInstancenameforAssessment\u003e from the dropdown for Assessment Monitor",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on select instance button for Assessment Monitor",
  "keyword": "And "
});
formatter.step({
  "name": "User has to edit a particular task\u003cEstDuration\u003e,\u003cActDuration\u003e,\u003cNote\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User should select instance successfully for Assessment Monitor",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProjectnameforAssessment",
        "InstancenameforAssessment",
        "EstDuration",
        "ActDuration",
        "Note"
      ]
    },
    {
      "cells": [
        "Alexa Pilot Phase Test",
        "P01",
        "3",
        "5",
        "Work In Progress"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Assessment Monitor functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Assessment Monitor page",
  "keyword": "Given "
});
formatter.match({
  "location": "AssessmentMonitor_StepDef.user_is_on_Assessment_Monitor_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Project NameAlexa Pilot Phase Test and Instance NameP01 from the dropdown for Assessment Monitor",
  "keyword": "When "
});
formatter.match({
  "location": "AssessmentMonitor_StepDef.user_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown_for_Assessment_Monitor(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on select instance button for Assessment Monitor",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitor_StepDef.user_has_to_click_on_select_instance_button_for_Assessment_Monitor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to edit a particular task3,5,Work In Progress",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitor_StepDef.user_has_to_edit_a_particular_task(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select instance successfully for Assessment Monitor",
  "keyword": "Then "
});
formatter.match({
  "location": "AssessmentMonitor_StepDef.user_should_select_instance_successfully_for_Assessment_Monitor()"
});
formatter.result({
  "status": "passed"
});
});