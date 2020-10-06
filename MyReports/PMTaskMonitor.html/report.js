$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/PMTaskMonitor/PMTaskMonitor.feature");
formatter.feature({
  "name": "PM Task Monitor",
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
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on PM Task Monitor page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select Project\u003cProjectName\u003e for PM Task Monitor",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on Submit button for PM Task Monitor",
  "keyword": "And "
});
formatter.step({
  "name": "User has to edit the task\u003cPMTask\u003e,\u003cEstDuration\u003e,\u003cActDuration\u003e and status\u003cStatus\u003e and comments\u003cComments\u003e for PM Task Monitor",
  "keyword": "And "
});
formatter.step({
  "name": "User successfully submitted the project name for PM Task Monitor module",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PMTask",
        "ProjectName",
        "EstDuration",
        "ActDuration",
        "Status",
        "Comments"
      ]
    },
    {
      "cells": [
        "QA",
        "jc Pilot Phase Test",
        "12:00",
        "13:00",
        "Work In Progress",
        "Work In Progress"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on PM Task Monitor page",
  "keyword": "Given "
});
formatter.match({
  "location": "PMTaskMonitor_StepDef.User_is_on_PM_Task_Monitor_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Projectjc Pilot Phase Test for PM Task Monitor",
  "keyword": "When "
});
formatter.match({
  "location": "PMTaskMonitor_StepDef.User_has_to_select_Project_Name_for_PM_Task_Monitor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Submit button for PM Task Monitor",
  "keyword": "And "
});
formatter.match({
  "location": "PMTaskMonitor_StepDef.User_has_to_click_on_Submit_button_for_PM_Task_Monitor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to edit the taskQA,12:00,13:00 and statusWork In Progress and commentsWork In Progress for PM Task Monitor",
  "keyword": "And "
});
formatter.match({
  "location": "PMTaskMonitor_StepDef.User_has_to_edit_the_task_and_status_and_comments_for_PM_Task_Monitor(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully submitted the project name for PM Task Monitor module",
  "keyword": "Then "
});
formatter.match({
  "location": "PMTaskMonitor_StepDef.User_successfully_submitted_the_project_name_for_PM_Task_Monitor_module()"
});
formatter.result({
  "status": "passed"
});
});