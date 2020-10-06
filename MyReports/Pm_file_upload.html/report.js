$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Pm_file_upload/Pm_file_upload.feature");
formatter.feature({
  "name": "Pm file upload in Pm login",
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
  "name": "Pm file upload",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Pm file upload page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select Project Name\u003cProject_Name\u003e and Instance Name\u003cInstance_Name\u003e from the dropdown",
  "keyword": "When "
});
formatter.step({
  "name": "User has to upload PM FILES for Comprehensive Assessment and Readiness Check Report, Landscape System Management, Custom Code Analysis, License Optimization",
  "keyword": "And "
});
formatter.step({
  "name": "User should upload file successfully and navigate to assessment report",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Project_Name",
        "Instance_Name"
      ]
    },
    {
      "cells": [
        "jc Pilot Phase Test",
        "J12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Pm file upload",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Pm file upload page",
  "keyword": "Given "
});
formatter.match({
  "location": "Pm_file_upload.User_should_navigate_to_Pm_file_upload_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Project Namejc Pilot Phase Test and Instance NameJ12 from the dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "Pm_file_upload.User_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to upload PM FILES for Comprehensive Assessment and Readiness Check Report, Landscape System Management, Custom Code Analysis, License Optimization",
  "keyword": "And "
});
formatter.match({
  "location": "Pm_file_upload.User_has_to_upload_PM_FILES()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should upload file successfully and navigate to assessment report",
  "keyword": "Then "
});
formatter.match({
  "location": "Pm_file_upload.user_should_upload_file_successfully_and_navigate_to_assessment_report()"
});
formatter.result({
  "status": "passed"
});
});